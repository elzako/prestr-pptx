package com.aspose.slides.internal.y5;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j3;
import com.aspose.slides.ms.System.y8;

public class k5 extends com.aspose.slides.internal.q3.c8 {
   private static final y8 n5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.a6.class);
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "get_data", "set_data", "get_length", "substringData", "appendData", "insertData", "deleteData", "replaceData"
   );

   @Override
   public void l6() {
      this.k5("substringData");
      this.k5("appendData");
      this.k5("insertData");
      this.k5("deleteData");
      this.k5("replaceData");
      this.n5("data", 3);
      this.n5("length", 1);
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   protected g7 n5(String var1, g7 var2, g7[] var3) {
      com.aspose.slides.internal.f5.a6 var4 = (com.aspose.slides.internal.f5.a6)var2.C_();
      switch (l6.n5(var1)) {
         case 0:
            return this.n5(var4.n5());
         case 1:
            var4.n5(var3[0].toString());
            break;
         case 2:
            return this.n5(var4.l6());
         case 3:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            return this.n5(var4.n5(var3[0].d2(), var3[1].d2()));
         case 4:
            if (var3.length != 1) {
               throw new j3("invalid arguments count.");
            }

            var4.u3(var3[0].toString());
            break;
         case 5:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            var4.n5(var3[0].d2(), var3[1].toString());
            break;
         case 6:
            if (var3.length != 2) {
               throw new j3("invalid arguments count.");
            }

            var4.l6(var3[0].d2(), var3[1].d2());
            break;
         case 7:
            if (var3.length != 3) {
               throw new j3("invalid arguments count.");
            }

            var4.n5(var3[0].d2(), var3[1].d2(), var3[2].toString());
            break;
         default:
            throw new j3("unknown function");
      }

      return this.u9();
   }

   @Override
   protected y8 k5() {
      return com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f5.r4.class);
   }
}
