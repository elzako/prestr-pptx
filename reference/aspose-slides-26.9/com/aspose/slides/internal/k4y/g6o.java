package com.aspose.slides.internal.k4y;

public class g6o extends b3 {
   private int n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private String n3;
   private String y4;
   private String e2;
   private String t9;
   private String z1;
   private String t4;
   private String q0;
   private String z3;
   private String m1;
   private String k7;
   private String m3;
   private String z8;
   private String j5;
   private String w1;
   private String r4;
   private String c4;
   private String y2;
   private String y1;
   private String a0;
   private String d2;
   private String d5;
   private String s3;
   private static final com.aspose.slides.internal.v6g.u9 p8 = new com.aspose.slides.internal.v6g.u9(
      "text:bibliography-type",
      "text:identifier",
      "text:address",
      "text:annote",
      "text:author",
      "text:booktitle",
      "text:chapter",
      "text:edition",
      "text:editor",
      "text:howpublished",
      "text:institution",
      "text:journal",
      "text:month",
      "text:note",
      "text:number",
      "text:organizations",
      "text:pages",
      "text:publisher",
      "text:school",
      "text:series",
      "text:title",
      "text:report-type",
      "text:volume",
      "text:year",
      "text:url",
      "text:custom1",
      "text:custom2",
      "text:custom3",
      "text:custom4",
      "text:custom5",
      "text:isbn",
      "text:issn"
   );

   public g6o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      g6o$1 var2 = new g6o$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         String var3 = var1.n3();
         boolean var4 = false;

         while (var4 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var3)) {
               break;
            }

            var4 = false;
            if (var1.s7() == 1) {
               switch (p8.n5(var1.n3())) {
                  default:
                     var1.r4();
                     var4 = true;
               }
            } else if (var1.s7() == 3 || var1.s7() == 13 || var1.s7() == 14) {
               this.s3 = com.aspose.slides.ms.System.d1.n5(this.s3, var1.z1());
            }
         }
      }
   }

   public g6o() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("text:bibliography-type", g4i.n5(this.n5));
      if (this.l6 != null) {
         var2.l6("text:identifier", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("text:address", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("text:annote", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("text:author", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("text:booktitle", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("text:chapter", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("text:edition", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("text:editor", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("text:howpublished", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("text:institution", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("text:journal", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("text:month", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("text:note", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("text:number", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("text:organizations", this.z1);
      }

      if (this.t4 != null) {
         var2.l6("text:pages", this.t4);
      }

      if (this.q0 != null) {
         var2.l6("text:publisher", this.q0);
      }

      if (this.z3 != null) {
         var2.l6("text:school", this.z3);
      }

      if (this.m1 != null) {
         var2.l6("text:series", this.m1);
      }

      if (this.k7 != null) {
         var2.l6("text:title", this.k7);
      }

      if (this.m3 != null) {
         var2.l6("text:report-type", this.m3);
      }

      if (this.z8 != null) {
         var2.l6("text:volume", this.z8);
      }

      if (this.j5 != null) {
         var2.l6("text:year", this.j5);
      }

      if (this.w1 != null) {
         var2.l6("text:url", this.w1);
      }

      if (this.r4 != null) {
         var2.l6("text:custom1", this.r4);
      }

      if (this.c4 != null) {
         var2.l6("text:custom2", this.c4);
      }

      if (this.y2 != null) {
         var2.l6("text:custom3", this.y2);
      }

      if (this.y1 != null) {
         var2.l6("text:custom4", this.y1);
      }

      if (this.a0 != null) {
         var2.l6("text:custom5", this.a0);
      }

      if (this.d2 != null) {
         var2.l6("text:isbn", this.d2);
      }

      if (this.d5 != null) {
         var2.l6("text:issn", this.d5);
      }

      if (this.s3 != null) {
         var2.l6(this.s3);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return p8;
   }

   // $VF: synthetic method
   static int n5(g6o var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(g6o var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(g6o var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(g6o var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(g6o var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String a6(g6o var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u9(g6o var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String h0(g6o var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String c8(g6o var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String t2(g6o var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String s7(g6o var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String x8(g6o var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String n3(g6o var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String y4(g6o var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String e2(g6o var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String t9(g6o var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String z1(g6o var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String t4(g6o var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String q0(g6o var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static String z3(g6o var0, String var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static String m1(g6o var0, String var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static String k7(g6o var0, String var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static String m3(g6o var0, String var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String z8(g6o var0, String var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static String j5(g6o var0, String var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static String w1(g6o var0, String var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static String r4(g6o var0, String var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static String c4(g6o var0, String var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static String y2(g6o var0, String var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static String y1(g6o var0, String var1) {
      return var0.a0 = var1;
   }

   // $VF: synthetic method
   static String a0(g6o var0, String var1) {
      return var0.d2 = var1;
   }

   // $VF: synthetic method
   static String d2(g6o var0, String var1) {
      return var0.d5 = var1;
   }
}
