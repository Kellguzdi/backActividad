<template>
  <b-container fluid>
    <b-row>
      <b-col>
        <h1 style="text-align: center; margin-top: 10px">Books</h1>
      </b-col>
    </b-row>
    <b-row>
      <b-col class="d-flex justify-content-center">
        <b-button
          variant="info"
          @click="openAddBookModal()"
          style="margin: 10px"
        >
          Añadir libro
        </b-button>
      </b-col>
    </b-row>
    <ModalSpinner :isLoading="isLoading" />
    <b-row class="justify-content-center" v-if="!isLoading">
      <b-card
        v-for="(book, index) in books"
        :key="index"
        :title="book.title"
        :img-src="book.image"
        img-alt="imagen"
        img-top
        style="max-width: 15rem; margin: 10px"
        class="mb-2"
        @mouseover="showButtons(index)"
        @mouseleave="hideButtons(index)"
      >
        <b-card-text>
          <b-row>
            <b-col>
              <b-card-text
                >Autor: {{ book.autor && book.autor.name }}</b-card-text
              >
              <b-card-text
                >Genero:
                {{ book.categoria && book.categoria.nameCategory }}</b-card-text
              >
              <b-card-text
                >Año de publicación: {{ book.issueDate }}</b-card-text
              >
            </b-col>
          </b-row>
        </b-card-text>
        <b-row v-if="showButtonsIndex === index" class="text-center">
          <b-col>
            <b-button variant="warning" @click="openEditBookModal(book)"
              ><font-awesome-icon icon="fa-solid fa-pen-to-square"
            /></b-button>
          </b-col>
          <b-col>
            <b-button variant="danger" @click="deleteBook(index)"
              ><font-awesome-icon icon="fa-solid fa-trash"
            /></b-button>
          </b-col>
        </b-row>
      </b-card>
    </b-row>
    <AddBookModal @bookAdded="refreshBookList" />
    <EditBookModal @bookEdited="refreshBookList" :book="selectedBook" />
  </b-container>
</template>

<script>
import Vue from "vue";
import bookService from "../books/Book";

export default Vue.extend({
  components: {
    ModalSpinner: () => import("../components/Modal.vue"),
    AddBookModal: () => import("../components/AddBookModal.vue"),
    EditBookModal: () => import("../components/EditBookModal.vue"),
  },
  data() {
    return {
      books: [],
      isLoading: true,
      showButtonsIndex: null,
      selectedBook: null,
    };
  },
  mounted() {
    this.getBooks();
  },
  methods: {
    async getBooks() {
      try {
        const data = await bookService.getBooks();
        this.books = data.data;
        this.isLoading = false;
      } catch (error) {
        console.log(error);
        this.isLoading = false;
      }
    },
    openAddBookModal() {
      this.$nextTick(() => {
        this.$bvModal.show("addBookModal");
      });
    },
    openEditBookModal(book) {
      this.selectedBook = book;

      this.$nextTick(() => {
        this.$bvModal.show("editBookModal");
      });
    },
    refreshBookList() {
      this.getBooks();
    },
    showButtons(index) {
      this.showButtonsIndex = index;
    },
    hideButtons(index) {
      this.showButtonsIndex = null;
    },
    deleteBook(index) {
      try {
        const book = this.books[index];
        bookService.deleteBook(book.id);
        this.books.splice(index, 1);
      } catch (error) {
        console.log(error);
      }
    },
  },
});
</script>
