package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.Xml.XmlDocument;

public final class m6n extends b3 {
   private String n5 = "";
   private com.aspose.slides.ms.System.Xml.t5 l6;
   private g1 k5;
   private c4 u3;
   private x0d a6;
   private i3 u9;
   private u3 h0;
   private s8x c8;
   private h4h t2;
   private q7o s7;
   private j5u x8;
   private t4t n3;
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "uri",
      "http://schemas.openxmlformats.org/drawingml/2006/table",
      "http://schemas.openxmlformats.org/drawingml/2006/chart",
      "http://schemas.microsoft.com/office/drawing/2014/chartex",
      "http://schemas.openxmlformats.org/drawingml/2006/diagram",
      "http://schemas.openxmlformats.org/presentationml/2006/ole",
      "http://schemas.openxmlformats.org/drawingml/2006/compatibility",
      "http://schemas.microsoft.com/office/powerpoint/2016/slidezoom",
      "http://schemas.microsoft.com/office/powerpoint/2016/summaryzoom",
      "http://schemas.microsoft.com/office/powerpoint/2016/sectionzoom",
      "http://schemas.microsoft.com/office/drawing/2017/model3d",
      "tbl",
      "chart",
      "relIds",
      "oleObj",
      "legacyDrawing",
      "sldZm",
      "summaryZm",
      "sectionZm",
      "model3d"
   );

   m6n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this();
      String var2 = var1.y4();

      while (var1.u3()) {
         if (!"xmlns".equals(var1.e2())) {
            switch (y4.n5(com.aspose.slides.ms.System.d1.a6(var1.n5(var1.e2()), var2) ? var1.n3() : var1.x8())) {
               case 0:
                  this.n5 = var1.z1();
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown attribute \"", var1.x8(), "\""}));
            }
         }
      }

      var1.a6();
      if (!var1.m1()) {
         switch (y4.n5(this.n5)) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
               n5(var1, new m6n$1(this, var1));
               break;
            default:
               XmlDocument var3 = new XmlDocument();
               this.l6 = var3.createDocumentFragment();
               this.l6.setInnerXml(var1.i1());
         }
      }
   }

   m6n() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("uri", this.n5);
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "chart");
      }

      if (this.a6 != null) {
         this.a6.n5("cx", var2, "chart");
      }

      if (this.k5 != null) {
         this.k5.n5("a", var2, "tbl");
      }

      if (this.u9 != null) {
         this.u9.n5("dgm", var2, "relIds");
      }

      if (this.h0 != null) {
         this.h0.n5("p", var2, "oleObj");
      }

      if (this.c8 != null) {
         this.c8.n5("com", var2, "legacyDrawing");
      }

      if (this.t2 != null) {
         this.t2.n5("pslz", var2, "sldZm");
      }

      if (this.x8 != null) {
         this.x8.n5("psez", var2, "sectionZm");
      }

      if (this.s7 != null) {
         this.s7.n5("psuz", var2, "summaryZm");
      }

      if (this.n3 != null) {
         this.n3.n5("am3d", var2, "model3d");
      }

      if (this.l6 != null) {
         this.l6.writeTo(var2);
      }

      var2.s7();
   }

   public final g1 n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <table> element can be added.");
      }

      this.z8();
      this.k5 = new g1();
      return this.k5;
   }

   public final c4 l6() {
      if (this.u3 != null) {
         throw new Exception("Only one <chart> element can be added.");
      }

      this.z8();
      this.u3 = new c4();
      return this.u3;
   }

   public final x0d k5() {
      if (this.a6 != null) {
         throw new Exception("Only one <chart> element can be added.");
      }

      this.z8();
      this.a6 = new x0d();
      return this.a6;
   }

   public final i3 u3() {
      if (this.u9 != null) {
         throw new Exception("Only one <smartArtRelId> element can be added.");
      }

      this.z8();
      this.u9 = new i3();
      return this.u9;
   }

   public final u3 a6() {
      if (this.h0 != null) {
         throw new Exception("Only one <oleObj> element can be added.");
      }

      this.z8();
      this.h0 = new u3();
      return this.h0;
   }

   public final h4h u9() {
      if (this.t2 != null) {
         throw new Exception("Only one <slideZoom> element can be added.");
      }

      this.z8();
      this.t2 = new h4h();
      return this.t2;
   }

   public final j5u h0() {
      if (this.x8 != null) {
         throw new Exception("Only one <sectionZoom> element can be added.");
      }

      this.z8();
      this.x8 = new j5u();
      return this.x8;
   }

   public final q7o c8() {
      if (this.s7 != null) {
         throw new Exception("Only one <sectionZoom> element can be added.");
      }

      this.z8();
      this.s7 = new q7o();
      return this.s7;
   }

   public final s8x t2() {
      if (this.c8 != null) {
         throw new Exception("Only one <legacyDrawing> element can be added.");
      }

      this.z8();
      this.c8 = new s8x();
      return this.c8;
   }

   public final void n5(t4t var1) {
      this.z8();
      this.n3 = var1;
   }

   private void z8() {
      this.l6 = null;
      this.k5 = null;
      this.u3 = null;
      this.a6 = null;
      this.u9 = null;
      this.h0 = null;
      this.c8 = null;
      this.t2 = null;
      this.x8 = null;
      this.x8 = null;
   }

   public final com.aspose.slides.ms.System.Xml.t5 s7() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.ms.System.Xml.t5 var1) {
      this.z8();
      this.l6 = var1;
   }

   public final String x8() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final g1 n3() {
      return this.k5;
   }

   public final c4 y4() {
      return this.u3;
   }

   public final x0d e2() {
      return this.a6;
   }

   public final i3 t9() {
      return this.u9;
   }

   public final u3 z1() {
      return this.h0;
   }

   public final h4h t4() {
      return this.t2;
   }

   public final q7o q0() {
      return this.s7;
   }

   public final j5u z3() {
      return this.x8;
   }

   public final t4t m1() {
      return this.n3;
   }

   public final s8x k7() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 m3() {
      return y4;
   }

   // $VF: synthetic method
   static g1 n5(m6n var0, g1 var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(m6n var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static c4 n5(m6n var0, c4 var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static x0d n5(m6n var0, x0d var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static i3 n5(m6n var0, i3 var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static u3 n5(m6n var0, u3 var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static s8x n5(m6n var0, s8x var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static h4h n5(m6n var0, h4h var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static q7o n5(m6n var0, q7o var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static j5u n5(m6n var0, j5u var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static t4t n5(m6n var0, t4t var1) {
      return var0.n3 = var1;
   }
}
