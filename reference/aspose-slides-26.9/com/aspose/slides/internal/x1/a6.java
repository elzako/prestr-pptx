package com.aspose.slides.internal.x1;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.z0k.t4;

class a6 implements s7 {
   private t4 n5 = null;
   private l6 l6 = null;
   private List<y4> k5 = null;
   private n3 u3 = null;
   private e2 a6 = null;

   @Override
   public final l6 n5() {
      return this.l6;
   }

   @Override
   public final y4 n5(int var1) {
      if (var1 < this.k5.size() - 1) {
         return this.k5.get_Item(var1);
      } else if (this.a6 != null && this.n5.getLength() / this.a6.u3() < this.k5.size()) {
         throw new k5("Chain of sectors corrupted!");
      } else {
         return null;
      }
   }

   @Override
   public final e2 l6() {
      return this.a6;
   }

   public a6(t4 var1) {
      this.n5 = var1;
      this.k5();
   }

   private void k5() {
      this.a6();
      this.u9();
      this.h0();
      if (this.l6.t2() != 4294967294L) {
         this.u3.n5(this, this.l6.t2() & 4294967295L);
      }

      this.u3();
   }

   private void u3() {
      this.a6 = new e2(this.l6.n5());
      this.a6.n5(this.u3, this);
   }

   private l6 a6() {
      this.l6 = new l6(this.n5);
      return this.l6;
   }

   private void u9() {
      this.u3 = new n3((int)this.l6.c8(), this.l6.n5());
      this.u3.n5(this.n5);
   }

   private void h0() {
      int var1 = this.l6.n5();
      boolean var2 = false;
      this.k5 = new List<>();
      com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(this.n5);

      while (!var2) {
         byte[] var4 = var3.c8(var1);
         if (var4.length < var1) {
            if (var4.length > 0) {
               byte[] var5 = new byte[var1];
               System.arraycopy(var4, 0, var5, 0, var4.length);
               var4 = var5;
            } else {
               var4 = new byte[var1];
               var2 = true;
            }
         }

         this.k5.addItem(new y4(var4));
      }
   }
}
