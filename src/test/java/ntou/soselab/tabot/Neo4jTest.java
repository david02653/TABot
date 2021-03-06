package ntou.soselab.tabot;

import ntou.soselab.tabot.repository.Neo4jHandler;
import org.junit.jupiter.api.Test;

public class Neo4jTest {
    /**
     * 查課程地圖 by Chapter
     */
    @Test
    public void readCurriculumMapByChapterTest() {
        String result = new Neo4jHandler("Java").readCurriculumMap("[07]Inheritance");
//        String result = new Neo4jHandler("SE").readCurriculumMap("[1]軟體工程導論");
        System.out.println("result: " + result);
    }

    /**
     * 查課程地圖 by Section
     */
    @Test
    public void readCurriculumMapBySectionTest() {
        String result = new Neo4jHandler("Java").readCurriculumMap("Displaying Text with printf");
//        String result = new Neo4jHandler("SE").readCurriculumMap("軟體開發主要活動");
        System.out.println("result: " + result);
    }

    /**
     * 查投影片 by Chapter name
     */
    @Test
    public void readSlideshowByChapterNameTest() {
        String result = new Neo4jHandler("Java").readSlideshowByName("Displaying Text with printf");
//        String result = new Neo4jHandler("SE").readSlideshowByName("軟體開發主要活動");
        System.out.println("result: " + result);
    }

    /**
     * 查投影片 by Section name
     */
    @Test
    public void readSlideshowBySectionNameTest() {
        String result = new Neo4jHandler("Java").readSlideshowByName("Displaying Text with printf");
        System.out.println("result: " + result);
    }

    /**
     * 查投影片 by Chapter id
     */
    @Test
    public void readSlideshowByChapterIdTest() {
        String result = new Neo4jHandler("Java").readSlideshowById(1);
        System.out.println("result: " + result);
    }

    /**
     * 擴增課程地圖
     */
//    @Test
//    public void addReferenceTest() {
//        new Neo4jHandler("Java").addReference(
//                "Control Statements",
//                "test",
//                "testURL",
//                "testRemark");
//    }

    /**
     * 查個人化考題
     */
    @Test
    public void readPersonalizedExamTest() {
        String result = new Neo4jHandler("Java").readPersonalizedExam("00957034");
        System.out.println(result);
    }

    /**
     * 查個人化教材
     */
    @Test
    public void readPersonalizedSubjectMatterTest() {
        String result = new Neo4jHandler("Java").readPersonalizedSubjectMatter("00957034");
        System.out.println("result: " + result);
    }

    /**
     * test for whether it can update personalized exam
     */
//    @Test
//    public void updatePersonalizedExamTest() {
//        new Neo4jHandler("Java").updatePersonalizedExam("000", "aaa", "1");
//    }
}
