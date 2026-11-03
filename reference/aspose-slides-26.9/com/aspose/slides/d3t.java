package com.aspose.slides;

import java.util.regex.Pattern;

class d3t {
   public static int n5 = 0;
   private static final String x8 = com.aspose.slides.ms.System.d1.n5(new String[]{"(", "<p:sp>", "|", "<p:ph", ")"});
   public static final com.aspose.slides.internal.r7c.c8 l6 = new com.aspose.slides.internal.r7c.c8(
      com.aspose.slides.ms.System.d1.n5("(({0})|({1}({2}){3})|({4}))",new Object[]{ x8, "<a:t>", "(.*?)", "</a:t>", "<a:br\\s*/?>"}), 0
   );
   public static final com.aspose.slides.internal.r7c.c8 k5 = new com.aspose.slides.internal.r7c.c8(
      com.aspose.slides.ms.System.d1.n5("(({0})|({1}({2}){3})|({4}))",new Object[]{ "<a:p>", "<a:t>", "(.*?)", "</a:t>", "<a:br\\s*/?>"}), 0
   );
   public static final com.aspose.slides.internal.r7c.c8 u3 = new com.aspose.slides.internal.r7c.c8(
      com.aspose.slides.ms.System.d1.n5("{0}{1}{2}",new Object[]{ "<c:v>", "(.*?)", "</c:v>"}), n5
   );
   public static final com.aspose.slides.internal.r7c.c8 a6 = new com.aspose.slides.internal.r7c.c8(
      "(<a:off\\sx=\"(\\-?[0-9]+)\"\\sy=\"(\\-?[0-9]+)\".*?<a:chOff\\sx=\"(\\-?[0-9]+)\"\\sy=\"(\\-?[0-9]+)\")", 4
   );
   public static final com.aspose.slides.internal.r7c.c8 u9 = new com.aspose.slides.internal.r7c.c8(
      "((<p:grpSp>(.*?)</p:grpSp>)|(<p:sp>(.*?)</p:sp>)|(<p:graphicFrame>(.*?)</p:graphicFrame>))", 4
   );
   public static final com.aspose.slides.internal.r7c.c8 h0 = new com.aspose.slides.internal.r7c.c8(
      com.aspose.slides.ms.System.d1.n5(
         "{0}|{1}|{2}",new Object[]{
         "(<a:p>.*?</a:p>)",
         "(<a:off\\sx=\"(\\-?[0-9]+)\"\\sy=\"(\\-?[0-9]+)\".*?<a:ext\\scx=\"([0-9]+)\"\\scy=\"([0-9]+)\")",
         "((<p:ph\\s*?type=\"([a-zA-Z0-9]+)\".*?idx=\"([0-9]+)\")|(<p:ph\\s*?type=\"([a-zA-Z0-9]+))|(<p:ph.*?idx=\"([0-9]+)))"
      }),
      4
   );
   public static final com.aspose.slides.internal.r7c.c8 c8 = new com.aspose.slides.internal.r7c.c8("(<a:t>(.*?)</a:t>)|(<a:br>.*?</a:br>)", 4);
   public static final com.aspose.slides.internal.r7c.c8 t2 = com.aspose.slides.internal.r7c.c8.n5(Pattern.compile("<p:text>(.*?)</p:text>", 0));
   public static final com.aspose.slides.internal.r7c.c8 s7 = com.aspose.slides.internal.r7c.c8.n5(Pattern.compile("<a:t>(.*?)</a:t>", 0));

   public static void n5() {
   }
}
