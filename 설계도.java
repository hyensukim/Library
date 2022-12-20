도서관리 프로그램

<오전반>
funnction1 패키지

class Book (OK)
 - 멤버변수
  String title, String publisher, String author, long serialNum
 - 생성자
 - getter & setter
 - toString() override
 
interface (OK)
 - BookRegister, BookDelete, BookUpdate
 - register(Book book), delete(Book book), update(Book book)
 - Book 객체 등록, 삭제, 수정

class BookService
 - 멤버변수
 List<Book> books : Book 객체를 List(컬렉션 프레임워크) 단위로 관리.
 - 메서드
  1.register(), delete(), update() 구현
    1) register(Book book){
      if(book == null){return;
      }else{
        boolean add = books.add(book);
        System.out.println(add); // 등록 시 true값 반환
      }
    }

    2) delete(Book book){
      boolean delete = books.remove(book);
      System.out.println(delete);
    } 

    3) update(Book book1){ //기존 Book 객체에 새로운 Book 객체를 덮어씌운다.
    if(book1 != null){
      for(int i = 0; i < boks.size(); i++){
        Book book2 = books.get(i);
        if(book1.getSerialNum() = book2.getSerialNum()){
          book2.set(i, book1);
          }
        }
      }
    }

class BookData
 - 목적 : 현재 List<Book> books 라는 컬렉션 프레임워크 내 요소 정보 기록.<입출력, 직렬화>

 


  







