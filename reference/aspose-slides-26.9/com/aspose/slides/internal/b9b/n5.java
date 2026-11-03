package com.aspose.slides.internal.b9b;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.g3x.k5;
import com.aspose.slides.internal.l9o.a3;
import com.aspose.slides.internal.l9o.a6;
import com.aspose.slides.internal.l9o.c8;
import com.aspose.slides.internal.l9o.e9;
import com.aspose.slides.internal.l9o.j9;
import com.aspose.slides.internal.l9o.n3;
import com.aspose.slides.internal.l9o.o5;
import com.aspose.slides.internal.l9o.p3;
import com.aspose.slides.internal.l9o.s7;
import com.aspose.slides.internal.l9o.u3;
import com.aspose.slides.internal.l9o.u9;
import com.aspose.slides.internal.l9o.v0;
import com.aspose.slides.internal.l9o.x8;
import com.aspose.slides.internal.l9o.x9;
import com.aspose.slides.internal.l9o.y0;
import com.aspose.slides.internal.o9b.l6;

public class n5 {
   public v0 n5(l6 var1, k5 var2) {
      switch (var2.k5()) {
         case 8207:
            if (var1.k5().getColorModel().getColorSpace() instanceof com.aspose.slides.internal.p0s.k5) {
               return new a6(var1, var2);
            }

            return new o5(var1, var2);
         case 135173:
            return new x9(var1, var2);
         case 135174:
            return new y0(var1, var2);
         case 137224:
            return new e9(var1, var2);
         case 139273:
         case 925707:
         case 2498570:
            if (var1.k5().getRaster().getDataBuffer().getDataType() == 0) {
               return new u3(var1, var2);
            }

            return new com.aspose.slides.internal.l9o.l6(var1, var2);
         case 196865:
            return new j9(var1, var2);
         case 197634:
            return new c8(var1, var2);
         case 198659:
            return new n3(var1, var2);
         case 397319:
            return new a3(var1, var2);
         case 1052676:
            return new p3(var1, var2);
         case 1060876:
            return new u9(var1, var2);
         case 1851406:
            return new x8(var1, var2);
         case 3424269:
            return new s7(var1, var2);
         default:
            throw new ArgumentException("Parameter is not valid");
      }
   }
}
