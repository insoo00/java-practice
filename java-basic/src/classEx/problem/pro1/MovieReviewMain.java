package classEx.problem.pro1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview mr1 = new MovieReview();
        mr1.title = "인셉션";
        mr1.review = "인생은 무한 루프";

        MovieReview mr2 = new MovieReview();
        mr2.title = "어바웃 타입";
        mr2.review = "인생 시간 영화!";

        MovieReview[] mrs = new MovieReview[]{mr1, mr2};
        for (MovieReview mr : mrs) {
            System.out.println("영화 제목: " + mr.title + ", 리뷰: " + mr.review);
        }
    }
}
