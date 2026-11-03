package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;

public class f5 extends y4 {
   private com.aspose.slides.internal.a0.y2 t2;
   private com.aspose.slides.internal.a0.t2 k7;
   private com.aspose.slides.internal.t1.m3 m3;
   private int z8 = 0;
   private int j5 = -1;

   public f5(e9 var1, com.aspose.slides.internal.t1.w1 var2, com.aspose.slides.internal.t1.m3 var3) {
      super(var2);
      this.n5(var1);
      this.m3 = var3;
      this.t2 = this.w1().l6(this.m3.z3());
   }

   public f5(e9 var1, com.aspose.slides.internal.t1.w1 var2, com.aspose.slides.internal.a0.t2 var3) {
      super(var2);
      this.n5(var1);
      this.k7 = var3;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      throw new InvalidOperationException();
   }

   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      com.aspose.slides.internal.p3.h0.n5(this, var1, var2);
      this.d5();
      this.t2 = null;
   }

   @Override
   public void l6(com.aspose.slides.internal.a0.l6 var1) {
      if (!com.aspose.slides.ms.System.d1.a6(this.a0().i1(), "xsl-footnote-separator")
         && !com.aspose.slides.ms.System.d1.a6(this.a0().i1(), "xsl-before-float-separator")) {
         this.t2.n5((com.aspose.slides.internal.a0.t2)var1);
      } else {
         this.k7.l6((com.aspose.slides.internal.a0.t2)var1);
      }
   }

   @Override
   public com.aspose.slides.internal.a0.l6 n5(com.aspose.slides.internal.a0.l6 var1) {
      return !com.aspose.slides.ms.System.d1.a6(this.a0().i1(), "xsl-footnote-separator")
            && !com.aspose.slides.ms.System.d1.a6(this.a0().i1(), "xsl-before-float-separator")
         ? this.t2
         : this.k7;
   }

   public final void y1() {
      int var1 = 0;
      int var2 = 0;
      int var3 = 9;
      boolean var4 = false;
      if (!com.aspose.slides.ms.System.d1.a6(this.a0().i1(), "xsl-footnote-separator")
         && !com.aspose.slides.ms.System.d1.a6(this.a0().i1(), "xsl-before-float-separator")) {
         var1 = this.t2.l6();
         var2 = this.t2.e_();
         var3 = this.m3.z7();
      } else {
         var1 = this.k7.l6();
         var2 = this.k7.e_();
         if (var2 == 0) {
            var4 = true;
         }

         var3 = 13;
      }

      this.a6(var1);
      this.u9(var2);
      f5$n5 var5 = new f5$n5(this, var1, var3);
      var5.n5(var2, var4);
      if (var5.n3() && !var4) {
         String var6 = this.z8().j5().l6().u9();
         w1 var7 = com.aspose.slides.internal.p3.n3.n5(this.a0().q_().m1());
         boolean var8 = this.m3.o0() != 42;
         boolean var9 = this.m3.o0() == 57 || this.m3.o0() == 42;
         var7.n5(this, this.m3.t9(), var6, var5.y4(), var9, var8, this.a0().m_());
      }
   }

   public final com.aspose.slides.internal.t1.w1 a0() {
      return (com.aspose.slides.internal.t1.w1)this.k5;
   }

   @Override
   public int c8() {
      return this.z8;
   }

   @Override
   protected void a6(int var1) {
      this.z8 = var1;
   }

   @Override
   public int t2() {
      return this.j5;
   }

   private void u9(int var1) {
      this.j5 = var1;
   }

   @Override
   public s3 a5() {
      return s3.n5;
   }

   @Override
   public s3 v0() {
      return s3.n5;
   }

   @Override
   public s3 h2() {
      return s3.n5;
   }
}
