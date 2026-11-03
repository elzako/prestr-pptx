package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

class t1k {
   private final Dictionary<Byte, h2d> n5;
   private final q8l l6 = new q8l();

   public final void n5(byte var1, h2d var2) {
      if (var1 == 6) {
         this.n5.set_Item((byte)1, var2);
      } else {
         this.n5.set_Item(var1, var2);
      }
   }

   public final y2t n5(int var1, h5p var2, int var3) {
      return this.n5(var3, var1, var2).l6();
   }

   public final void n5(List<z6n> var1) {
      this.l6.n5(var1);
   }

   private j1w n5(int var1, int var2, h5p var3) {
      switch (var1) {
         case 0:
            return new c5r(this.n5, var2, var3);
         case 1:
            return new p6(this.n5, var2, var3, this.l6);
         default:
            throw new ArgumentOutOfRangeException("mode", com.aspose.slides.ms.System.s3.n5(TextExtractionArrangingMode.class, var1));
      }
   }

   public t1k() {
      Dictionary var1 = new Dictionary();
      var1.addItem((byte)1, new h2d());
      var1.addItem((byte)3, new h2d());
      var1.addItem((byte)4, new h2d());
      var1.addItem((byte)5, new h2d());
      var1.addItem((byte)8, new h2d());
      this.n5 = new Dictionary<>(var1);
   }
}
