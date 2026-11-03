package com.aspose.slides.internal.z4;

import com.aspose.slides.ms.System.d1;

public class u9 extends z1 {
   private d5 n5;
   private int k5 = 0;
   private int u3 = 0;
   private final w1 a6;
   private final m3 u9;
   private t9 h0;
   private z3 c8;
   private com.aspose.slides.internal.e6r.n5 t2;
   private com.aspose.slides.internal.e6r.t2 s7;
   private String x8;
   private com.aspose.slides.internal.f6.n5 n3;

   public u9(c8 var1) {
      super(var1);
      this.a6 = new w1(var1);
      this.u9 = new m3(var1);
      if (this.l6.y4()) {
         this.t2 = new com.aspose.slides.internal.e6r.n5();
         this.s7 = new com.aspose.slides.internal.e6r.t2(this.l6);
         this.a6().n5(true);
      }

      if (this.l6.e2()) {
         this.h0 = new t9(this.l6);
      }

      if (this.l6.y4() || this.l6.e2()) {
         this.c8 = new z3(this.l6);
      }
   }

   @Override
   public void n5(t4 var1) {
      var1.n5(this.e2());
      var1.n5(this);
      var1.c8();
      var1.k5("/Type", "/Catalog");
      var1.k5("/Pages", this.a6.t2());
      if (this.l6.u3() != null) {
         var1.k5("/Names", this.a6.k5().t2());
      }

      if (this.l6.y4()) {
         var1.k5("/StructTreeRoot", this.s7.t2());
         if (!d1.n5(this.x8)) {
            var1.u3("/Lang", this.x8);
         }

         this.t2.n5(var1);
      }

      var1.n5("/MarkInfo");
      var1.c8();
      var1.n5("/Marked", true);
      var1.t2();
      var1.k5("/Outlines", this.u9.l6());
      if (!this.u9.n5()) {
         var1.k5("/PageMode", "/UseOutlines");
      }

      if (this.n5 != null) {
         var1.k5("/ViewerPreferences", this.n5.t2());
      }

      if (this.k5 != 0) {
         var1.k5("/PageLayout", y4.k5(this.k5));
      }

      if (this.u3 != 0) {
         var1.k5("/PageMode", y4.l6(this.u3));
         if (this.u9() == 3) {
            this.a6().l6(true);
         }
      }

      if (this.t9()) {
         var1.k5("/AcroForm", this.u3().t2());
      }

      if (this.l6.y4() || this.l6.e2()) {
         var1.k5("/Metadata", this.c8.t2());
      }

      if (this.l6.e2()) {
         var1.k5("/OutputIntents", " ");
         var1.n5("[");
         var1.c8();
         var1.k5("/Type", "/OutputIntent");
         var1.n5("/Info", "sRGB IEC61966-2.1", true);
         var1.k5("/S", "/GTS_PDFA1");
         var1.n5("/OutputConditionIdentifier", "Custom", true);
         var1.k5("/DestOutputProfile", this.h0.t2());
         var1.t2();
         var1.n5("]");
      }

      var1.t2();
      var1.l6();
      if (this.n5 != null) {
         this.n5.n5(var1);
      }

      if (this.t9()) {
         this.u3().n5(var1);
      }

      this.a6.n5(var1);
      this.u9.n5(var1);
      if (this.l6.e2()) {
         this.h0.n5(var1);
      }

      if (this.l6.y4() || this.l6.e2()) {
         this.c8.n5(var1);
      }

      if (this.l6.y4()) {
         this.s7.n5(var1);
      }

      if (this.l6.u3() != null) {
         this.a6.k5().n5(var1);
      }
   }

   public final w1 n5() {
      return this.a6;
   }

   public final m3 l6() {
      return this.u9;
   }

   public final com.aspose.slides.internal.e6r.t2 k5() {
      return this.s7;
   }

   public final void n5(String var1) {
      this.x8 = var1;
   }

   public final com.aspose.slides.internal.f6.n5 u3() {
      if (this.n3 == null) {
         this.n3 = new com.aspose.slides.internal.f6.n5(this.l6);
      }

      return this.n3;
   }

   private boolean t9() {
      return this.n3 != null;
   }

   public final d5 a6() {
      if (this.n5 == null) {
         this.n5 = new d5(this.l6);
      }

      return this.n5;
   }

   public final int u9() {
      return this.u3;
   }
}
