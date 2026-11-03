package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class f5 extends b3 {
   private float n5;
   private int l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private boolean t2;
   private boolean s7;
   private long x8;
   private String n3;
   private j6m y4;
   private g1a e2;
   private h4j t9;
   private s8k z1;
   private p4p t4;
   private q8g q0;
   private u1g z3;
   private v5e m1;
   private l5e k7;
   private v0y m3;
   private r9o z8;
   private k4x j5;
   private i8n w1;
   private x8o r4;
   private y1g c4;
   private static final com.aspose.slides.internal.v6g.u9 y2 = new com.aspose.slides.internal.v6g.u9(
      "serverZoom",
      "firstSlideNum",
      "showSpecialPlsOnTitleSld",
      "rtl",
      "removePersonalInfoOnSave",
      "compatMode",
      "strictFirstAndLastChars",
      "embedTrueTypeFonts",
      "saveSubsetFonts",
      "autoCompressPictures",
      "bookmarkIdSeed",
      "conformance",
      "sldMasterIdLst",
      "notesMasterIdLst",
      "handoutMasterIdLst",
      "sldIdLst",
      "sldSz",
      "notesSz",
      "smartTags",
      "embeddedFontLst",
      "custShowLst",
      "photoAlbum",
      "custDataLst",
      "kinsoku",
      "defaultTextStyle",
      "modifyVerifier",
      "extLst"
   );

   public f5(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.i1();
      f5$1 var2 = new f5$1(this);
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
               switch (y2.n5(var1.n3())) {
                  case 12:
                     this.y4 = new j6m(var1);
                     break;
                  case 13:
                     this.e2 = new g1a(var1);
                     break;
                  case 14:
                     this.t9 = new h4j(var1);
                     break;
                  case 15:
                     this.z1 = new s8k(var1);
                     break;
                  case 16:
                     this.t4 = new p4p(var1);
                     break;
                  case 17:
                     this.q0 = new q8g(var1);
                     break;
                  case 18:
                     this.z3 = new u1g(var1);
                     var4 = true;
                     break;
                  case 19:
                     this.m1 = new v5e(var1);
                     break;
                  case 20:
                     this.k7 = new l5e(var1);
                     break;
                  case 21:
                     this.m3 = new v0y(var1);
                     var4 = true;
                     break;
                  case 22:
                     this.z8 = new r9o(var1);
                     break;
                  case 23:
                     this.j5 = new k4x(var1);
                     var4 = true;
                     break;
                  case 24:
                     this.w1 = new i8n(var1);
                     break;
                  case 25:
                     this.r4 = new x8o(var1);
                     break;
                  case 26:
                     this.c4 = new y1g(var1);
                     break;
                  default:
                     var1.r4();
                     var4 = true;
               }
            }
         }
      }
   }

   public f5() {
      this.i1();
      this.q0 = new q8g();
   }

   private void i1() {
      this.n5 = 50.0F;
      this.l6 = 1;
      this.k5 = true;
      this.u3 = false;
      this.a6 = false;
      this.u9 = false;
      this.h0 = true;
      this.c8 = false;
      this.t2 = false;
      this.s7 = true;
      this.x8 = 1L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("p", var3, "http://schemas.openxmlformats.org/presentationml/2006/main");
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      if (var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
         var2.u3("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
      }

      if (this.n5 != 50.0F) {
         if (var2.n5) {
            var2.l6("serverZoom", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.n5), "%"}));
         } else {
            var2.l6(
               "serverZoom",
               com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5 * 1000.0F), 14))
            );
         }
      }

      if (this.l6 != 1) {
         var2.l6("firstSlideNum", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      }

      if (!this.k5) {
         var2.l6("showSpecialPlsOnTitleSld", this.k5 ? "1" : "0");
      }

      if (this.u3) {
         var2.l6("rtl", this.u3 ? "1" : "0");
      }

      if (this.a6) {
         var2.l6("removePersonalInfoOnSave", this.a6 ? "1" : "0");
      }

      if (this.u9) {
         var2.l6("compatMode", this.u9 ? "1" : "0");
      }

      if (!this.h0) {
         var2.l6("strictFirstAndLastChars", this.h0 ? "1" : "0");
      }

      if (this.c8) {
         var2.l6("embedTrueTypeFonts", this.c8 ? "1" : "0");
      }

      if (this.t2) {
         var2.l6("saveSubsetFonts", this.t2 ? "1" : "0");
      }

      if (!this.s7) {
         var2.l6("autoCompressPictures", this.s7 ? "1" : "0");
      }

      if ((this.x8 & 4294967295L) != 1L) {
         var2.l6("bookmarkIdSeed", com.aspose.slides.ms.System.Xml.f4.l6(this.x8));
      }

      if (this.n3 != null) {
         var2.l6("conformance", this.n3);
      }

      if (this.y4 != null) {
         this.y4.n5("p", var2, "sldMasterIdLst");
      }

      if (this.e2 != null) {
         this.e2.n5("p", var2, "notesMasterIdLst");
      }

      if (this.t9 != null) {
         this.t9.n5("p", var2, "handoutMasterIdLst");
      }

      if (this.z1 != null) {
         this.z1.n5("p", var2, "sldIdLst");
      }

      if (this.t4 != null) {
         this.t4.n5("p", var2, "sldSz");
      }

      this.q0.n5("p", var2, "notesSz");
      if (this.z3 != null) {
         this.z3.n5("p", var2, "smartTags");
      }

      if (this.m1 != null) {
         this.m1.n5("p", var2, "embeddedFontLst");
      }

      if (this.k7 != null) {
         this.k7.n5("p", var2, "custShowLst");
      }

      if (this.m3 != null) {
         this.m3.n5("p", var2, "photoAlbum");
      }

      if (this.z8 != null) {
         this.z8.n5("p", var2, "custDataLst");
      }

      if (this.j5 != null) {
         this.j5.n5("p", var2, "kinsoku");
      }

      if (this.w1 != null) {
         this.w1.n5("p", var2, "defaultTextStyle");
      }

      if (this.r4 != null) {
         this.r4.n5("p", var2, "modifyVerifier");
      }

      if (this.c4 != null) {
         this.c4.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final j6m n5() {
      if (this.y4 != null) {
         throw new Exception("Only one <sldMasterIdLst> element can be added.");
      }

      this.y4 = new j6m();
      return this.y4;
   }

   public final g1a l6() {
      if (this.e2 != null) {
         throw new Exception("Only one <notesMasterIdLst> element can be added.");
      }

      this.e2 = new g1a();
      return this.e2;
   }

   public final h4j k5() {
      if (this.t9 != null) {
         throw new Exception("Only one <handoutMasterIdLst> element can be added.");
      }

      this.t9 = new h4j();
      return this.t9;
   }

   public final s8k u3() {
      if (this.z1 != null) {
         throw new Exception("Only one <sldIdLst> element can be added.");
      }

      this.z1 = new s8k();
      return this.z1;
   }

   public final p4p a6() {
      if (this.t4 != null) {
         throw new Exception("Only one <sldSz> element can be added.");
      }

      this.t4 = new p4p();
      return this.t4;
   }

   public final void n5(c9 var1) {
      this.z3 = (u1g)var1;
   }

   public final v5e u9() {
      if (this.m1 != null) {
         throw new Exception("Only one <embeddedFontLst> element can be added.");
      }

      this.m1 = new v5e();
      return this.m1;
   }

   public final l5e h0() {
      if (this.k7 != null) {
         throw new Exception("Only one <custShowLst> element can be added.");
      }

      this.k7 = new l5e();
      return this.k7;
   }

   public final void l6(c9 var1) {
      this.m3 = (v0y)var1;
   }

   public final r9o c8() {
      if (this.z8 != null) {
         throw new Exception("Only one <custDataLst> element can be added.");
      }

      this.z8 = new r9o();
      return this.z8;
   }

   public final void k5(c9 var1) {
      this.j5 = (k4x)var1;
   }

   public final i8n t2() {
      if (this.w1 != null) {
         throw new Exception("Only one <defaultTextStyle> element can be added.");
      }

      this.w1 = new i8n();
      return this.w1;
   }

   public final void n5(x8o var1) {
      this.r4 = var1;
   }

   public final void n5(x8 var1) {
      this.c4 = (y1g)var1;
   }

   public final float s7() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   public final int x8() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final boolean n3() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   public final boolean y4() {
      return this.u3;
   }

   public final void l6(boolean var1) {
      this.u3 = var1;
   }

   public final boolean e2() {
      return this.a6;
   }

   public final void k5(boolean var1) {
      this.a6 = var1;
   }

   public final boolean t9() {
      return this.u9;
   }

   public final void u3(boolean var1) {
      this.u9 = var1;
   }

   public final boolean z1() {
      return this.h0;
   }

   public final void a6(boolean var1) {
      this.h0 = var1;
   }

   public final void u9(boolean var1) {
      this.c8 = var1;
   }

   public final boolean t4() {
      return this.t2;
   }

   public final void h0(boolean var1) {
      this.t2 = var1;
   }

   public final boolean q0() {
      return this.s7;
   }

   public final void c8(boolean var1) {
      this.s7 = var1;
   }

   public final long z3() {
      return this.x8;
   }

   public final void n5(long var1) {
      this.x8 = var1;
   }

   public final void n5(String var1) {
      this.n3 = var1;
   }

   public final j6m m1() {
      return this.y4;
   }

   public final g1a k7() {
      return this.e2;
   }

   public final h4j m3() {
      return this.t9;
   }

   public final s8k z8() {
      return this.z1;
   }

   public final p4p j5() {
      return this.t4;
   }

   public final q8g w1() {
      return this.q0;
   }

   public final u1g r4() {
      return this.z3;
   }

   public final v5e c4() {
      return this.m1;
   }

   public final l5e y2() {
      return this.k7;
   }

   public final v0y y1() {
      return this.m3;
   }

   public final r9o a0() {
      return this.z8;
   }

   public final k4x d2() {
      return this.j5;
   }

   public final i8n d5() {
      return this.w1;
   }

   public final x8o s3() {
      return this.r4;
   }

   public final x8 p8() {
      return this.c4;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 f2() {
      return y2;
   }

   // $VF: synthetic method
   static float n5(f5 var0, float var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(f5 var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(f5 var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(f5 var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean k5(f5 var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean u3(f5 var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean a6(f5 var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean u9(f5 var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean h0(f5 var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean c8(f5 var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static long n5(f5 var0, long var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String n5(f5 var0, String var1) {
      return var0.n3 = var1;
   }
}
