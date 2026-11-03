package com.aspose.slides.internal.q8o;

import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.y4g.v8;

public class h0 extends com.aspose.slides.internal.n4m.n5 {
   private int[] n5;
   private String[] l6;

   public h0(v8 var1, byte[] var2) {
      super(var1, (byte)13, var2);
   }

   @Override
   public void c8() {
      super.c8();
      this.x8().x8().n5(this.n5);
      this.x8().x8().n5(this.l6);
      this.x8().x8().l6(true);
   }

   @Override
   protected void t2() {
      this.s7();
   }

   @Override
   protected void s7() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.l6(), 6);
      this.n5 = new int[var1];

      for (int var2 = 0; var2 < var1; var2++) {
         this.n5[var2] = com.aspose.slides.internal.v6g.k5.u3(this.l6(), 6);
      }

      if (this.k5() != 0) {
         com.aspose.slides.internal.x8w.l6 var5 = new com.aspose.slides.internal.x8w.l6(this.n5((int)this.k5()));
         this.l6 = new String[var5.n5()];

         for (int var3 = 0; var3 < var5.n5(); var3++) {
            com.aspose.slides.internal.x8w.l6 var4 = new com.aspose.slides.internal.x8w.l6(var5.n5(var3).u3());
            this.l6[var3] = j5.z3().l6(var4.n5(1).u3());
         }
      }
   }
}
