import axios from 'axios';

const ITEMS_API_BASE_URL = "http://localhost:8080/api/v1/items";

class ItemService {

    getItems(){
        return axios.get(ITEMS_API_BASE_URL);
    }

    createItems(item){
        return axios.post(ITEMS_API_BASE_URL, item);
    }

    getById(id){
        return axios.get(ITEMS_API_BASE_URL + '/' + id);
    }

    updateItem(item, id){
        return axios.put(ITEMS_API_BASE_URL + '/' + id, item);
    }

    deleteItem(id){
        return axios.delete(ITEMS_API_BASE_URL + '/' + id);
    }
}

export default new ItemService()