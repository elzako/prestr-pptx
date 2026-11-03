package com.aspose.slides.internal.d9v;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.g3x.k5;
import com.aspose.slides.internal.l9o.a0;
import com.aspose.slides.internal.l9o.d2;
import com.aspose.slides.internal.l9o.d5;
import com.aspose.slides.internal.l9o.e2;
import com.aspose.slides.internal.l9o.f0;
import com.aspose.slides.internal.l9o.j5;
import com.aspose.slides.internal.l9o.k7;
import com.aspose.slides.internal.l9o.m1;
import com.aspose.slides.internal.l9o.t4;
import com.aspose.slides.internal.l9o.t9;
import com.aspose.slides.internal.l9o.w1;
import com.aspose.slides.internal.l9o.y2;
import com.aspose.slides.internal.l9o.y4;
import com.aspose.slides.internal.l9o.z1;
import com.aspose.slides.internal.l9o.z3;
import com.aspose.slides.internal.l9o.z8;
import com.aspose.slides.internal.o9b.l6;

public class n5 {
   public f0 n5(l6 var1, k5 var2, com.aspose.slides.internal.j9e.n5 var3) {
      switch (var2.k5()) {
         case 8207:
            if (var1.k5().getColorModel().getColorSpace() instanceof com.aspose.slides.internal.p0s.k5) {
               return new j5(var1, var2, var3);
            }

            return new m1(var1, var2, var3);
         case 135173:
            return new t9(var1, var2, var3);
         case 135174:
            return new z1(var1, var2, var3);
         case 137224:
            return new z3(var1, var2, var3);
         case 139273:
         case 925707:
         case 2498570:
            if (var1.k5().getRaster().getDataBuffer().getDataType() == 0) {
               return new z8(var1, var2, var3);
            }

            return new k7(var1, var2, var3);
         case 196865:
            return new t4(var1, var2, var3);
         case 197634:
            return new y2(var1, var2, var3);
         case 198659:
            return new d5(var1, var2, var3);
         case 397319:
            return new y4(var1, var2, var3);
         case 1052676:
            return new e2(var1, var2, var3);
         case 1060876:
            return new w1(var1, var2, var3);
         case 1851406:
            return new d2(var1, var2, var3);
         case 3424269:
            return new a0(var1, var2, var3);
         default:
            throw new ArgumentException("Parameter is not valid");
      }
   }
}
