package com.aspose.slides;

import com.aspose.slides.ms.System.IDisposable;

class g4x implements IDisposable {
   private com.aspose.slides.internal.k0r.z6z n5;
   private com.aspose.slides.internal.z0k.n5 l6;
   private com.aspose.slides.internal.z0k.t4 k5;
   private int u3;
   private long a6;

   g4x(com.aspose.slides.internal.k0r.z6z var1, com.aspose.slides.internal.z0k.n5 var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = this.l6.x8();
      this.n5();
   }

   final void n5() {
      this.u3 = this.n5.a6();
      this.a6 = this.n5.u9() + 8L;
   }

   final com.aspose.slides.internal.k0r.z6z l6() {
      if (this.u3 < 1) {
         return null;
      }

      this.k5.setPosition(this.a6);
      com.aspose.slides.internal.k0r.z6z var1 = new com.aspose.slides.internal.k0r.z6z(this.l6);
      this.a6 = this.a6 + (8 + var1.a6());
      this.u3 = this.u3 - (8 + var1.a6());
      return var1;
   }

   final com.aspose.slides.internal.k0r.z6z n5(int var1) {
      com.aspose.slides.internal.k0r.z6z var2 = null;

      do {
         var2 = this.l6();
         if (var2 != null && com.aspose.slides.internal.v6g.k5.k5(var2.u3(), 8) == com.aspose.slides.internal.v6g.k5.k5(var1, 8)) {
            return var2;
         }
      } while (var2 != null);

      return null;
   }

   @Override
   public final void dispose() {
      this.n5 = null;
      this.l6 = null;
      this.k5 = null;
   }
}
