package com.aspose.slides.internal.j9e;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.o9b.y2;

public final class e2 {
   z1 n5;
   t9 l6;

   e2(com.aspose.slides.internal.m5l.k5 var1) {
      if (var1.a6()) {
         com.aspose.slides.internal.m5l.u3 var2 = (com.aspose.slides.internal.m5l.u3)var1;
         this.n5 = new z1();
         this.n5.t2 = var2.e2();
         this.n5.c8 = var2.y4();
         this.n5.u9 = (int)var2.x8();
         this.n5.h0 = (int)var2.n3();
         this.n5.n5 = var1.u9();
         this.n5.l6 = var2.n5().k5() * 2;
         this.n5.u3 = var2.h0();
         this.n5.a6 = var2.c8();
         this.n5.n3 = 0;
         this.n5.y4 = 0;
         this.n5.k5 = var2.n5().l6();
         this.n5.x8 = var2.n5().u3() * 2;
         this.n5.s7 = new n3(var2.n5());
      } else {
         this.l6 = new t9();
         com.aspose.slides.internal.m5l.n5 var4 = (com.aspose.slides.internal.m5l.n5)var1;
         com.aspose.slides.internal.o3i.l6 var3 = var4.n5();
         this.l6.h0 = (int)(var4.x8() + 0.5);
         this.l6.c8 = (int)(var4.n3() + 0.5);
         this.l6.t2 = (int)(var4.y4() + 0.5);
         this.l6.s7 = (int)(var4.e2() + 0.5);
         this.l6.a6 = var4.h0();
         this.l6.u9 = var4.c8();
         this.l6.n5 = var1.u9();
         this.l6.k5 = var4.l6();
         this.l6.l6 = var3.u3;
         this.l6.u3 = 1;
         this.l6.x8 = var3.u3 + 80;
         this.l6.n3 = 0;
         this.l6.y4 = 0;
      }
   }

   public y2 n5() {
      return !this.l6() ? new y2(this.l6.h0, this.l6.c8, this.l6.t2, this.l6.s7) : new y2(this.n5.u9, this.n5.h0, this.n5.c8, this.n5.t2);
   }

   public boolean l6() {
      if (this.n5 == null && this.l6 == null) {
         throw new ArgumentException("Invalid state");
      } else {
         return this.n5 != null && (this.n5.n5 == 1 || this.n5.n5 == 2);
      }
   }
}
