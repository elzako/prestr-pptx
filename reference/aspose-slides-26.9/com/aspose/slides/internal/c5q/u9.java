package com.aspose.slides.internal.c5q;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import java.awt.image.BufferedImage;

public class u9 {
   public static a6 n5(BufferedImage var0, com.aspose.slides.internal.g7e.n5 var1) {
      int var2 = var1.z1();
      switch (var2) {
         case 0:
            if (var0.getType() == 10) {
               return new l6();
            }

            if (var0.getType() == 13 && var0.getRaster().getDataBuffer().getDataType() == 0) {
               return new l6();
            }
            break;
         case 1:
            if (var0.getType() == 1 || var0.getType() == 2) {
               return new n3();
            }

            if (var0.getType() == 4) {
               return new x8();
            }

            if (var0.getType() == 5) {
               return new t2();
            }

            if (var0.getType() == 6) {
               return new s7();
            }
            break;
         case 2:
         case 3:
            if (com.aspose.slides.internal.t5g.u3.a6()) {
               return new n5();
            }
            break;
         case 4:
            if (var0.getType() == 5) {
               return new h0();
            }

            if (var0.getType() == 1) {
               return new c8();
            }
            break;
         default:
            throw new ArgumentOutOfRangeException("dstColorType");
      }

      return null;
   }
}
