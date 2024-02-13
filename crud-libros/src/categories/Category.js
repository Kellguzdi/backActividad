import axios from "axios";

let API_URL = "http://localhost:8080/api/categories/";

const getCategories = async () => {
  try {
    const response = await axios.get(API_URL);
    return response.data;
  } catch (error) {
    throw error;
  }
};

export default {
  getCategories,
};
