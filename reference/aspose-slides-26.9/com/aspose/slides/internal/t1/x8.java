package com.aspose.slides.internal.t1;

import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.d1;

public abstract class x8 extends com.aspose.slides.internal.e5.t9 {
   private com.aspose.slides.internal.h2.t2 h0;
   private int c8;
   private int t2;
   private String s7;
   private com.aspose.slides.internal.f2.u3 x8;
   private com.aspose.slides.internal.v8.n3 n3;
   protected z8 u9;

   protected x8(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
      this.u9 = (z8)var1;
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      this.h0 = var1.u3();
      this.c8 = var1.u3(87).a6();
      this.t2 = var1.u3(169).a6();
      this.s7 = var1.u3(199).j_();
      this.x8 = var1.u3(197).u9();
      this.n3 = com.aspose.slides.internal.v8.n3.n5(var1.u3(267).a6());
      if (d1.n5(this.s7)) {
         this.s7 = this.i1();
      } else if (this.a6(this.b3()) && !d1.a6(this.b3(), this.i1())) {
         this.y4().s7(this, this.t9(), this.s7, this.m_());
      }

      if (this.e5().u9(false, null) != 0 || this.e5().a6(false, null) != 0) {
         this.y4().k5(this, this.t9(), this.s7, true, this.m_());
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         this.k5(var1, var2, var3);
      }
   }

   public abstract y1 n5(com.aspose.slides.internal.f2.n5 var1);

   public abstract String i1();

   protected final boolean a6(String var1) {
      return d1.a6(var1, "xsl-region-before")
         || d1.a6(var1, "xsl-region-start")
         || d1.a6(var1, "xsl-region-end")
         || d1.a6(var1, "xsl-region-after")
         || d1.a6(var1, "xsl-before-float-separator")
         || d1.a6(var1, "xsl-footnote-separator");
   }

   protected final com.aspose.slides.internal.f2.u9 a6(int var1) {
      return this.u9.a6(var1);
   }

   protected final com.aspose.slides.internal.f2.u9 u9(int var1) {
      return this.u9.u9(var1);
   }

   @Override
   public boolean j5() {
      return true;
   }

   protected final x8 h0(int var1) {
      return this.u9.h0(var1);
   }

   public final com.aspose.slides.internal.h2.t2 e5() {
      return this.h0;
   }

   public final String b3() {
      return this.s7;
   }

   public final int o0() {
      return this.t2;
   }

   public final int z7() {
      return this.c8;
   }

   public final int v4() {
      return this.x8.u3();
   }

   public final com.aspose.slides.internal.v8.n3 u6() {
      return this.n3;
   }
}
