package com.aspose.slides.internal.j9e;

import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.x9;

public final class u9 implements IDisposable {
   private a6 n5;
   private int l6;
   private int k5;
   private int u3;
   private x9 a6;

   private u9() {
   }

   public u9(a6 var1, long var2) {
      this.n5 = var1;
      this.l6 = 1;
      this.k5 = 4;
      this.a6 = com.aspose.slides.internal.e3m.n5.n5(4);
      this.u3 = (int)var2;
      com.aspose.slides.internal.e3m.n5.k5(this.a6, (int)var2);
   }

   @Deprecated
   public u9(a6 var1, int var2) {
      this.n5 = var1;
      this.l6 = 1;
      this.k5 = 1;
      this.u3 = var2;
   }

   public a6 n5() {
      return this.n5;
   }

   @Deprecated
   public int l6() {
      return this.u3;
   }

   public int k5() {
      return this.l6;
   }

   public int u3() {
      return this.k5;
   }

   private void n5(boolean var1) {
   }

   @Override
   public void dispose() {
      this.n5(true);
   }
}
