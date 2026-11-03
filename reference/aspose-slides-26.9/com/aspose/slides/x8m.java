package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

class x8m implements r0g {
   private byte k5;
   y2[] n5;
   Dictionary<String, Integer> l6;
   private ITextFrameFormat u3;
   private long a6;

   x8m(ITextFrameFormat var1) {
      this.u3 = var1;
      this.k5 = -1;
   }

   public final byte n5() {
      return this.k5;
   }

   public final void n5(byte var1) {
      this.k5 = var1;
      this.u3();
   }

   public final boolean l6() {
      return this.k5 != 9 && this.k5 != 10 && this.k5 != 11 && this.k5 != 12;
   }

   final void n5(x8m var1) {
      if (var1.n5 != null) {
         this.n5 = new y2[var1.n5.length];

         for (int var2 = 0; var2 < this.n5.length; var2++) {
            this.n5[var2] = new y2(var1.n5[var2]);
         }
      } else {
         this.n5 = null;
      }

      this.k5 = var1.k5;
      this.u3();
   }

   @Override
   public boolean equals(Object obj) {
      x8m var2 = com.aspose.slides.internal.v6g.k5.n5(obj, x8m.class);
      if (var2 == null) {
         return false;
      }

      if ((this.n5 != null || var2.n5 == null) && (this.n5 == null || var2.n5 != null)) {
         if (this.n5 != null && var2.n5 != null) {
            if (this.n5.length != var2.n5.length) {
               return false;
            }

            for (int var3 = 0; var3 < this.n5.length; var3++) {
               if (this.n5[var3].n5() != var2.n5[var3].n5() || !com.aspose.slides.ms.System.d1.a6(this.n5[var3].k5(), var2.n5[var3].k5())) {
                  return false;
               }
            }
         }

         return this.k5 == var2.k5;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return 23454;
   }

   @Override
   public final r0g getParent_Immediate() {
      return (r0g)this.u3;
   }

   private void u3() {
      this.a6++;
      if (com.aspose.slides.internal.v6g.k5.l6(this.u3, PVIObject.class)) {
         ((PVIObject)this.u3).k7();
      }
   }

   final long k5() {
      return this.a6;
   }
}
