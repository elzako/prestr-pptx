package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class o0 extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private int u3;
   private String a6;
   private int u9;
   private int h0;
   private int c8;
   private long t2;
   private int s7;
   private int x8;
   private byte n3;
   private c6s y4;
   private c8t e2;
   private byte t9;
   private byte z1;
   private String t4;
   private byte q0;
   private String z3;
   private String m1;
   private static final com.aspose.slides.internal.v6g.u9 k7 = new com.aspose.slides.internal.v6g.u9(
      "Template",
      "Manager",
      "Company",
      "Pages",
      "Words",
      "Characters",
      "PresentationFormat",
      "Lines",
      "Paragraphs",
      "Slides",
      "Notes",
      "TotalTime",
      "HiddenSlides",
      "MMClips",
      "ScaleCrop",
      "HeadingPairs",
      "TitlesOfParts",
      "LinksUpToDate",
      "CharactersWithSpaces",
      "SharedDoc",
      "HyperlinkBase",
      "HLinks",
      "HyperlinksChanged",
      "DigSig",
      "Application",
      "AppVersion",
      "DocSecurity"
   );

   public o0(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.m3();
      if (!var1.m1()) {
         String var2 = var1.n3();
         boolean var3 = false;

         while (var3 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var2)) {
               break;
            }

            var3 = false;
            if (var1.s7() == 1) {
               switch (k7.n5(var1.n3())) {
                  case 0:
                     this.n5 = var1.c4();
                     if (!var1.m1()) {
                        while (var1.s7() != 15) {
                           var1.u9();
                           this.n5 = com.aspose.slides.ms.System.d1.n5(this.n5, var1.c4());
                        }
                     }
                     break;
                  case 1:
                     this.l6 = var1.c4();
                     if (!var1.m1()) {
                        while (var1.s7() != 15) {
                           var1.u9();
                           this.l6 = com.aspose.slides.ms.System.d1.n5(this.l6, var1.c4());
                        }
                     }
                     break;
                  case 2:
                     this.k5 = var1.c4();
                     if (!var1.m1()) {
                        while (var1.s7() != 15) {
                           var1.u9();
                           this.k5 = com.aspose.slides.ms.System.d1.n5(this.k5, var1.c4());
                        }
                     }
                     break;
                  case 3:
                     var1.r4();
                     var3 = true;
                     break;
                  case 4:
                     var1.u9();
                     this.u3 = com.aspose.slides.ms.System.Xml.f4.e2(var1.z1());
                     break;
                  case 5:
                     var1.r4();
                     var3 = true;
                     break;
                  case 6:
                     this.a6 = var1.c4();
                     if (!var1.m1()) {
                        while (var1.s7() != 15) {
                           var1.u9();
                           this.a6 = com.aspose.slides.ms.System.d1.n5(this.a6, var1.c4());
                        }
                     }
                     break;
                  case 7:
                     var1.r4();
                     var3 = true;
                     break;
                  case 8:
                     var1.u9();
                     this.u9 = com.aspose.slides.ms.System.Xml.f4.e2(var1.z1());
                     break;
                  case 9:
                     var1.u9();
                     this.h0 = com.aspose.slides.ms.System.Xml.f4.e2(var1.z1());
                     break;
                  case 10:
                     var1.u9();
                     this.c8 = com.aspose.slides.ms.System.Xml.f4.e2(var1.z1());
                     break;
                  case 11:
                     var1.u9();
                     this.t2 = q0(var1.z1());
                     break;
                  case 12:
                     var1.u9();
                     this.s7 = com.aspose.slides.ms.System.Xml.f4.e2(var1.z1());
                     break;
                  case 13:
                     var1.u9();
                     this.x8 = com.aspose.slides.ms.System.Xml.f4.e2(var1.z1());
                     break;
                  case 14:
                     var1.u9();
                     this.n3 = z1(var1.z1());
                     break;
                  case 15:
                     this.y4 = new c6s(var1);
                     break;
                  case 16:
                     this.e2 = new c8t(var1);
                     break;
                  case 17:
                     var1.u9();
                     this.t9 = z1(var1.z1());
                     break;
                  case 18:
                     var1.r4();
                     var3 = true;
                     break;
                  case 19:
                     var1.u9();
                     this.z1 = z1(var1.z1());
                     break;
                  case 20:
                     this.t4 = var1.c4();
                     if (!var1.m1()) {
                        while (var1.s7() != 15) {
                           var1.u9();
                           this.t4 = com.aspose.slides.ms.System.d1.n5(this.t4, var1.c4());
                        }
                     }
                     break;
                  case 21:
                     var1.r4();
                     var3 = true;
                     break;
                  case 22:
                     var1.u9();
                     this.q0 = z1(var1.z1());
                     break;
                  case 23:
                     var1.r4();
                     var3 = true;
                     break;
                  case 24:
                     this.z3 = var1.c4();
                     if (!var1.m1()) {
                        while (var1.s7() != 15) {
                           var1.u9();
                           this.z3 = com.aspose.slides.ms.System.d1.n5(this.z3, var1.c4());
                        }
                     }
                     break;
                  case 25:
                     this.m1 = var1.c4();
                     if (!var1.m1()) {
                        while (var1.s7() != 15) {
                           var1.u9();
                           this.m1 = com.aspose.slides.ms.System.d1.n5(this.m1, var1.c4());
                        }
                     }
                     break;
                  case 26:
                     var1.r4();
                     var3 = true;
                     break;
                  default:
                     var1.r4();
                     var3 = true;
               }
            }
         }
      }
   }

   public o0() {
      this.m3();
   }

   private void m3() {
      this.n5 = "";
      this.l6 = "";
      this.k5 = "";
      this.u3 = 0;
      this.a6 = "";
      this.t2 = 4294967295L;
      this.n3 = -1;
      this.t9 = -1;
      this.z1 = -1;
      this.t4 = "";
      this.q0 = -1;
      this.z3 = "";
      this.m1 = "";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("", var3, "http://schemas.openxmlformats.org/officeDocument/2006/extended-properties");
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes") == null) {
         var2.u3("xmlns", "vt", null, "http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes");
      }

      if (!"".equals(this.n5)) {
         this.n5("", var2, "Template", this.n5, false);
      }

      if (!"".equals(this.l6)) {
         this.n5("", var2, "Manager", this.l6, false);
      }

      this.n5("", var2, "Company", this.k5, false);
      if (this.u3 != 0) {
         this.n5("", var2, "Words", com.aspose.slides.ms.System.Xml.f4.n5(this.u3), false);
      }

      if (!"".equals(this.a6)) {
         this.n5("", var2, "PresentationFormat", this.a6, false);
      }

      this.n5("", var2, "Paragraphs", com.aspose.slides.ms.System.Xml.f4.n5(this.u9), false);
      this.n5("", var2, "Slides", com.aspose.slides.ms.System.Xml.f4.n5(this.h0), false);
      this.n5("", var2, "Notes", com.aspose.slides.ms.System.Xml.f4.n5(this.c8), false);
      if ((this.t2 & 4294967295L) != 4294967295L) {
         this.n5("", var2, "TotalTime", com.aspose.slides.ms.System.Xml.f4.l6(this.t2), false);
      }

      this.n5("", var2, "HiddenSlides", com.aspose.slides.ms.System.Xml.f4.n5(this.s7), false);
      this.n5("", var2, "MMClips", com.aspose.slides.ms.System.Xml.f4.n5(this.x8), false);
      if (this.n3 != -1) {
         this.n5("", var2, "ScaleCrop", this.n3 == 1 ? "1" : "0", false);
      }

      if (this.y4 != null) {
         this.y4.n5("", var2, "HeadingPairs");
      }

      if (this.e2 != null) {
         this.e2.n5("", var2, "TitlesOfParts");
      }

      if (this.t9 != -1) {
         this.n5("", var2, "LinksUpToDate", this.t9 == 1 ? "1" : "0", false);
      }

      if (this.z1 != -1) {
         this.n5("", var2, "SharedDoc", this.z1 == 1 ? "1" : "0", false);
      }

      if (!"".equals(this.t4)) {
         this.n5("", var2, "HyperlinkBase", this.t4, false);
      }

      if (this.q0 != -1) {
         this.n5("", var2, "HyperlinksChanged", this.q0 == 1 ? "1" : "0", false);
      }

      if (!"".equals(this.z3)) {
         this.n5("", var2, "Application", this.z3, false);
      }

      if (!"".equals(this.m1)) {
         this.n5("", var2, "AppVersion", this.m1, false);
      }

      var2.s7();
   }

   public final c6s n5() {
      if (this.y4 != null) {
         throw new Exception("Only one <headingPairs> element can be added.");
      }

      this.y4 = new c6s();
      return this.y4;
   }

   public final c8t l6() {
      if (this.e2 != null) {
         throw new Exception("Only one <titlesOfParts> element can be added.");
      }

      this.e2 = new c8t();
      return this.e2;
   }

   public final String k5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String u3() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final String a6() {
      return this.k5;
   }

   public final void k5(String var1) {
      this.k5 = var1;
   }

   public final int u9() {
      return this.u3;
   }

   public final String h0() {
      return this.a6;
   }

   public final void u3(String var1) {
      this.a6 = var1;
   }

   public final int c8() {
      return this.u9;
   }

   public final void n5(int var1) {
      this.u9 = var1;
   }

   public final int t2() {
      return this.h0;
   }

   public final void l6(int var1) {
      this.h0 = var1;
   }

   public final int s7() {
      return this.c8;
   }

   public final void k5(int var1) {
      this.c8 = var1;
   }

   public final long x8() {
      return this.t2;
   }

   public final void n5(long var1) {
      this.t2 = var1;
   }

   public final int n3() {
      return this.s7;
   }

   public final void u3(int var1) {
      this.s7 = var1;
   }

   public final void a6(int var1) {
      this.x8 = var1;
   }

   public final byte y4() {
      return this.n3;
   }

   public final void n5(byte var1) {
      this.n3 = var1;
   }

   public final c6s e2() {
      return this.y4;
   }

   public final c8t t9() {
      return this.e2;
   }

   public final byte z1() {
      return this.t9;
   }

   public final void l6(byte var1) {
      this.t9 = var1;
   }

   public final byte t4() {
      return this.z1;
   }

   public final void k5(byte var1) {
      this.z1 = var1;
   }

   public final String q0() {
      return this.t4;
   }

   public final void a6(String var1) {
      this.t4 = var1;
   }

   public final byte z3() {
      return this.q0;
   }

   public final void u3(byte var1) {
      this.q0 = var1;
   }

   public final String m1() {
      return this.z3;
   }

   public final void u9(String var1) {
      this.z3 = var1;
   }

   public final String k7() {
      return this.m1;
   }

   public final void h0(String var1) {
      this.m1 = var1;
   }
}
