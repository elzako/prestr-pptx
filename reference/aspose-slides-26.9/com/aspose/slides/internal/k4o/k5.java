package com.aspose.slides.internal.k4o;

import com.aspose.slides.internal.c4i.d2;
import java.util.List;

public class k5 extends a6 {
   private com.aspose.slides.internal.o3i.l6 l6;

   public k5(com.aspose.slides.internal.o3i.l6 var1) {
      this.l6 = var1;
      this.n5(var1);
   }

   public void n5() {
      for (com.aspose.slides.internal.m5l.l6 var2 : this.n5) {
         if (this.l6(var2)) {
            ((com.aspose.slides.internal.x1f.n5)var2).u9();
         }
      }
   }

   public com.aspose.slides.internal.o3i.l6 l6() {
      return this.l6;
   }

   public d2 k5() {
      if (this.n5.size() > 1 && this.n5.get(1) instanceof com.aspose.slides.internal.x1f.n5) {
         com.aspose.slides.internal.x1f.n5 var1 = (com.aspose.slides.internal.x1f.n5)this.n5.get(1);
         List var2 = var1.u3();
         if (var2 != null && var2.size() > 0 && var2.get(0) instanceof d2) {
            return (d2)var2.get(0);
         }
      }

      return null;
   }

   public u9 u3() {
      return new u3(this);
   }

   @Override
   public void n5(com.aspose.slides.internal.m5l.l6 var1) {
      com.aspose.slides.internal.x1f.n5 var2 = this.u9();
      if (var2 != null && this.l6(var1)) {
         com.aspose.slides.internal.x1f.n5 var3 = (com.aspose.slides.internal.x1f.n5)var1;
         this.n5(var3, var2);
      } else {
         super.n5(var1);
      }
   }

   private com.aspose.slides.internal.x1f.n5 u9() {
      if (this.n5.size() > 0) {
         com.aspose.slides.internal.m5l.l6 var1 = this.n5.get(this.n5.size() - 1);
         if (this.l6(var1)) {
            return (com.aspose.slides.internal.x1f.n5)var1;
         }
      }

      return null;
   }

   private boolean l6(com.aspose.slides.internal.m5l.l6 var1) {
      return var1 instanceof com.aspose.slides.internal.x1f.n5 && ((com.aspose.slides.internal.x1f.n5)var1).a6();
   }

   private void n5(com.aspose.slides.internal.x1f.n5 var1, com.aspose.slides.internal.x1f.n5 var2) {
      byte[] var3 = var1.k5();
      byte[] var4 = var2.k5();
      byte[] var5 = new byte[var4.length + var3.length - 4];
      System.arraycopy(var4, 0, var5, 0, var4.length);
      System.arraycopy(var3, 4, var5, var4.length, var3.length - 4);
      var2.n5(var5);
      var2.n5(var5.length);
   }
}
