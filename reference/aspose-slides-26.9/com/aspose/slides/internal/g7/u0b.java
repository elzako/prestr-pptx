package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.NotSupportedException;

public class u0b implements v7 {
   private s1 n5;
   private c4i l6;
   private b9 k5;
   private q5 u3;
   private Object a6 = new Object();
   private Object u9 = new Object();

   public u0b(c4i var1) {
      this.k5 = new b9();
      this.l6 = var1;
   }

   public final b9 n5() {
      return this.k5;
   }

   public final q5 l6() {
      if (this.u3 == null) {
         synchronized (this.a6) {
            if (this.u3 == null) {
               this.u3 = com.aspose.slides.internal.g7.u9.n5;
            }
         }
      }

      return this.u3;
   }

   public final void n5(q5 var1) {
      this.u3 = var1;
   }

   @Override
   public final r9 l6(int var1) {
      String var2 = this.n5().n5((char)(var1 & 65535));
      return new k3(var2);
   }

   @Override
   public final void n5(int var1, int var2) {
      throw new NotSupportedException();
   }

   @Override
   public final int n5(r9 var1) {
      k3 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, k3.class);
      return var2 != null ? this.l6().n5(var2.n5()) : 0;
   }

   @Override
   public final r9 n5(int var1) {
      int var2 = this.l6().n5((char)(var1 & 65535));

      for (int var3 = 0; var3 < var2; var3++) {
         String var4 = this.l6().n5((char)(var1 & 65535), var3);
         if (this.k5().l6(var4) && this.k5().n5(var4) != 0) {
            return new k3(var4);
         }
      }

      return k3.n5;
   }

   public final s1 k5() {
      if (this.n5 == null) {
         synchronized (this.u9) {
            if (this.n5 == null) {
               this.n5 = new s1();

               for (int var2 = 0; var2 < 256; var2++) {
                  if (this.n5().n5(var2) != null && !this.n5.l6(this.n5().n5(var2))) {
                     this.n5.l6(this.n5().n5(var2), var2);
                  }
               }
            }
         }
      }

      return this.n5;
   }
}
