package com.aspose.slides.internal.r1x;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.ObjectDisposedException;

public abstract class r4 extends q0 implements Cloneable {
   private boolean l6;
   private com.aspose.slides.internal.b8u.a6 k5;
   private j8 u3;
   private e9 a6;
   private com.aspose.slides.internal.g7e.u9 u9;
   private com.aspose.slides.internal.g7e.k5 h0;
   protected com.aspose.slides.internal.t6q.s7 n5;

   protected r4() {
   }

   protected r4(r4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("imageOptions");
      }

      this.l6 = var1.l6;
      this.k5 = var1.k5;
      this.a6 = var1.u3();
   }

   public com.aspose.slides.internal.t6q.s7 n5() {
      throw new NotImplementedException();
   }

   public void n5(com.aspose.slides.internal.t6q.s7 var1) {
      throw new NotImplementedException();
   }

   public final j8 l6() {
      return this.u3;
   }

   public final void n5(j8 var1) {
      this.l6(this.u3);
      this.u3 = var1;
      com.aspose.slides.internal.l0u.n5 var2 = com.aspose.slides.internal.v6g.k5.n5(this.u3, com.aspose.slides.internal.l0u.n5.class);
      if (var2 != null) {
         j4 var3 = null;
         j4[] var4 = new j4[]{var3};
         boolean var5 = j4.n5((Object)(var2.n5()), var4);
         var3 = var4[0];
         if (var5) {
            var3.a6();
         } else {
            var3 = i9.n5().n5(var2.n5());
         }

         var2.n5(var3);
      }
   }

   public com.aspose.slides.internal.b8u.a6 k5() {
      return this.k5;
   }

   public void n5(com.aspose.slides.internal.b8u.a6 var1) {
      this.k5 = var1;
   }

   public e9 u3() {
      return this.a6;
   }

   public void n5(e9 var1) {
      this.a6 = var1;
   }

   public final com.aspose.slides.internal.g7e.u9 u9() {
      return this.u9;
   }

   public final void n5(com.aspose.slides.internal.g7e.u9 var1) {
      this.u9 = var1;
   }

   public final com.aspose.slides.internal.g7e.k5 h0() {
      return this.h0;
   }

   public final void n5(com.aspose.slides.internal.g7e.k5 var1) {
      this.h0 = var1;
   }

   @Override
   protected void a6() {
      this.l6(this.l6());
      super.a6();
   }

   private void l6(j8 var1) {
      com.aspose.slides.internal.l0u.n5 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.l0u.n5.class);

      try {
         if (var2 != null) {
            com.aspose.slides.internal.z0k.t4 var3 = var2.n5();
            j4 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, j4.class);
            if (var4 != null && var4.k5() != null) {
               i9.n5().n5(var4);
            }
         }
      } catch (ObjectDisposedException var5) {
      }
   }
}
