package com.aspose.slides.internal.x9;

import com.aspose.slides.internal.p3.o0;
import com.aspose.slides.internal.p3.v4;

public class d2$l6 extends com.aspose.slides.internal.p3.d5 {
   public int n5 = 0;
   public int l6 = 0;
   public com.aspose.slides.internal.v8.u9 u3;
   private int h0;
   private int c8;
   private int t2;
   private int s7;
   private d2 x8;
   private d2 n3;
   public int a6 = -1;

   public d2$l6(d2 var1, int var2, int var3, int var4, int var5, d2 var6) {
      this.x8 = var1;
      this.h0 = var2;
      this.c8 = var3;
      this.t2 = var4;
      this.s7 = var5;
      this.n3 = var6;
   }

   @Override
   public void t2() {
      if (this.h0 == 23) {
         this.u3 = com.aspose.slides.internal.v8.u9.n5(this.s7);
      } else {
         this.u3 = com.aspose.slides.internal.v8.u9.n5(this.s7, this.s7, this.x8.t4);
      }

      if (this.h0 == 23 && this.c8 != 70) {
         this.addItem(new com.aspose.slides.internal.p3.e5(0, 10008, 0, null, false));
         this.n5++;
      }

      if (this.n3.s7 && this.n3.y4.size() == 0 && this.t2 != 0) {
         this.addItem(new c4(this.t2, null, null, false));
         this.n5++;
      }
   }

   public final void u9() {
      v4 var1 = this.h0();
      var1.k5 = this.a6;
      if (var1 != null) {
         this.n3.y4.addItem(var1);
      }
   }

   @Override
   public v4 h0() {
      if (this.size() <= this.n5) {
         this.clear();
         return null;
      }

      if (this.h0 == 23 && this.c8 != 70) {
         this.addItem(new com.aspose.slides.internal.p3.e5(0, 10008, 0, null, false));
         this.addItem(new o0(this.u3.l6(), -1000, false, null, false));
         this.l6 = 2;
      } else if (this.c8 != 70) {
         this.addItem(new o0(0, 1000, false, null, false));
         this.addItem(new com.aspose.slides.internal.p3.e5(0, this.u3.a6(), this.u3.u3(), null, false));
         this.addItem(new o0(this.u3.l6(), -1000, false, null, false));
         this.l6 = 3;
      } else {
         this.addItem(new o0(this.u3.l6(), -1000, false, null, false));
         this.l6 = 1;
      }

      return this;
   }

   public final boolean n3() {
      for (int var1 = 0; var1 < this.size(); var1++) {
         com.aspose.slides.internal.p3.i1 var2 = (com.aspose.slides.internal.p3.i1)this.get_Item(var1);
         if (var2.e2()) {
            return true;
         }
      }

      return false;
   }
}
