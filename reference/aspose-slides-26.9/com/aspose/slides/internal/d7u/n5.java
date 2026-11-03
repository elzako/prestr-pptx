package com.aspose.slides.internal.d7u;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.internal.y5s.y4;

public class n5 extends y4 {
   private int n5 = 2;
   private boolean l6;
   private int k5 = 0;
   private int u3 = 6;
   private byte a6 = 8;

   public int k5() {
      return this.n5;
   }

   public void n5(int var1) {
      this.n5 = var1;
   }

   public boolean u3() {
      return this.l6;
   }

   public void n5(boolean var1) {
      this.l6 = var1;
   }

   public int a6() {
      return this.k5;
   }

   public int u9() {
      return this.u3;
   }

   public void l6(int var1) {
      if (var1 <= 9 && var1 >= 0) {
         this.u3 = var1;
      } else {
         throw new ArgumentOutOfRangeException("value", "Compresion must be in 0-9 range.");
      }
   }

   public byte h0() {
      return this.a6;
   }

   public void n5(byte var1) {
      this.a6 = var1;
   }

   public void c8() {
      switch (this.k5()) {
         case 0:
            if (com.aspose.slides.internal.v6g.k5.u3(this.a6, 6) != 1
               && com.aspose.slides.internal.v6g.k5.u3(this.a6, 6) != 2
               && com.aspose.slides.internal.v6g.k5.u3(this.a6, 6) != 4
               && com.aspose.slides.internal.v6g.k5.u3(this.a6, 6) != 8) {
               throw new com.aspose.slides.internal.d9m.n5("Bit depth of 1, 2, 4 or 8 bits are supported for grayscale images.");
            }
            break;
         case 1:
         case 5:
         default:
            throw new ArgumentOutOfRangeException();
         case 2:
            if (com.aspose.slides.internal.v6g.k5.u3(this.a6, 6) != 8) {
               throw new com.aspose.slides.internal.d9m.n5("Bit depth of 8 bits are supported for RGB images.");
            }
            break;
         case 3:
            if (com.aspose.slides.internal.v6g.k5.u3(this.a6, 6) != 1
               && com.aspose.slides.internal.v6g.k5.u3(this.a6, 6) != 2
               && com.aspose.slides.internal.v6g.k5.u3(this.a6, 6) != 4
               && com.aspose.slides.internal.v6g.k5.u3(this.a6, 6) != 8) {
               throw new com.aspose.slides.internal.d9m.n5("Bit depth of 1, 2, 4 or 8 bits are supported for palette images.");
            }
            break;
         case 4:
            if (com.aspose.slides.internal.v6g.k5.u3(this.a6, 6) != 8) {
               throw new com.aspose.slides.internal.d9m.n5("Bit depth of 8 bits are supported for grayscale images with alpha channel.");
            }
            break;
         case 6:
            if (com.aspose.slides.internal.v6g.k5.u3(this.a6, 6) != 8) {
               throw new com.aspose.slides.internal.d9m.n5("Bit depth of 8 bits are supported for RGBA images.");
            }
      }
   }
}
