class Map{
    int key;
    int value;
    Map next;

    Map(int key , int value){
        this.key = key;
        this.value = value;
    }
}

class myMap{
    Map [] arr;

    myMap(){
        arr = new Map[10];
    }
    
    public void put(int key,int value){
        int val = hashFunction(key);
        if(arr[val] == null){
            arr[val] = new Map(key,value);
            return;
        }
        Map map = arr[val];
        Map prev = null;
        while(map != null){
            if(map.key == key){
                map.value = value;
                return;
            }
            prev = map;
            map = map.next;
        }
        prev.next = new Map(key,value);
    }

    public int hashFunction(int key){
        int sum = 0;
        while(key != 0){
            sum += key%10;
            key /= 10;
        }
        return sum%10;
    }

    public boolean contains(int key){
        int val = hashFunction(key);
        Map map = arr[val];
        while(map != null){
            if(map.key == key){
                return true;
            }
            map = map.next;
        }
        return false;
    }

    public void printMyMap(){
        System.out.print("{");
        for(Map map : arr){
            while(map != null){
                System.out.print(map.key +" : "+ map.value + " , ");
                map = map.next;
            }
        }
        System.out.println("}");
    }
}

public class Example_01{
    public static void main(String [] args){
         myMap map = new myMap();
         map.put(70,81);
         map.put(34,45);
         map.printMyMap();
         map.put(3,89);
         map.put(34,90);
         map.printMyMap();
         boolean b = map.contains(70);
         System.out.println("map contains 34 : "+b);
    }
}