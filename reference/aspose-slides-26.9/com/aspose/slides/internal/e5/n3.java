package com.aspose.slides.internal.e5;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.d1;

public class n3 extends com.aspose.slides.internal.w2.l6 {
   protected u9 n5;
   protected com.aspose.slides.internal.t1.k7 l6 = null;
   protected n3$n5 k5;
   protected com.aspose.slides.internal.w2.u3 u3;
   private y4 a6;
   private c8 u9;
   private com.aspose.slides.internal.w2.u9 h0;
   private com.aspose.slides.internal.y1.u3 c8;
   private boolean t2 = false;
   private boolean s7 = true;
   private int x8;

   public final void n5(String var1) {
      if (this.c8 != null) {
         this.c8.n5(var1);
      }
   }

   public n3(String var1, com.aspose.slides.internal.y1.u3 var2, com.aspose.slides.internal.z0k.t4 var3) {
      this.c8 = var2;
      this.n5 = this.c8.a6().u9();
      this.u9 = var2.q0().n5(var2, var1, var3);
      if (this.c8.m3()) {
         this.u9 = new com.aspose.slides.internal.y2.n5(var2.z8(), this.u9);
      }

      this.a6 = new y4();
      this.a6.n5(new n3$l6(null));
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1) {
      this.h0 = var1;
   }

   protected final com.aspose.slides.internal.w2.u9 n5() {
      return this.c8.z3() ? this.h0 : null;
   }

   @Override
   public void n5(char[] var1, int var2, int var3) {
      this.u3.n5(var1, var2, var3);
   }

   @Override
   public void l6(char[] var1, int var2, int var3) {
      this.u3.l6(var1, var2, var3);
   }

   @Override
   public void l6() {
      if (this.t2) {
         throw new InvalidOperationException(d1.n5(new String[]{"FOTreeBuilder (and the Fop class) cannot be reused.", " Please instantiate a new instance."}));
      }

      this.t2 = true;
      this.s7 = true;
      this.l6 = null;
      this.u9.n5();
      this.k5 = new n3$n5(this);
      this.k5.l6();
      this.u3 = this.k5;
   }

   @Override
   public void k5() {
      this.u3.k5();
      if (this.l6 == null && this.s7) {
         q0 var1 = e2.n5(this.c8.m1());
         var1.n5(this);
      }

      this.l6 = null;
      this.u9.l6();
   }

   @Override
   public void n5(String var1, String var2, String var3, com.aspose.slides.internal.w2.k5 var4) {
      this.x8++;
      this.u3.n5(var1, var2, var3, var4);
   }

   @Override
   public void n5(String var1, String var2, String var3) {
      this.u3.n5(var1, var2, var3);
      this.x8--;
      if (this.x8 == 0 && this.u3 != this.k5) {
         this.u3.k5();
         this.u3 = this.k5;
         this.u3.n5(var1, var2, var3);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.t2 var1) {
   }

   // $VF: synthetic method
   static boolean n5(n3 var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.y1.u3 n5(n3 var0) {
      return var0.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.w2.u9 l6(n3 var0) {
      return var0.h0;
   }

   // $VF: synthetic method
   static y4 k5(n3 var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static c8 u3(n3 var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static int n5(n3 var0, int var1) {
      return var0.x8 = var1;
   }
}
