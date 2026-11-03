package com.aspose.slides.internal.y8;

import com.aspose.slides.internal.f5.c8;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.n2d.x8;
import com.aspose.slides.internal.z0k.m3;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.internal.z0k.w1;
import com.aspose.slides.internal.z0k.y1;
import com.aspose.slides.ms.System.d1;

public class l6 implements com.aspose.slides.internal.p6.l6 {
   private t4 n5;
   private String l6;
   private y1 k5;
   private String u3;

   @Override
   public final y1 n5() {
      return this.k5;
   }

   @Override
   public final t4 l6() {
      return this.n5;
   }

   @Override
   public final String k5() {
      return this.l6;
   }

   @Override
   public final void n5(String var1) {
      this.l6 = var1;
      this.k5 = new w1(var1);
   }

   @Override
   public final void l6(String var1) {
      this.u3 = var1;
      if (this.n5 != null) {
         j5 var2 = d1.n5(this.u3) ? c8.n5 : x8.n5(this.u3);
         this.k5 = new m3(this.n5, var2);
      } else if (this.l6 != null) {
         this.k5 = new w1(this.l6);
      }
   }

   @Override
   public final void dispose() {
      this.n5 = null;
      if (this.k5 != null) {
         this.k5.dispose();
         this.k5 = null;
      }
   }
}
