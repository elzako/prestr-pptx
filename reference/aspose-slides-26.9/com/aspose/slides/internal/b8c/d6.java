package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.exceptions.XmlSchemaException;

public class d6 extends c2 {
   private static final char[] n5 = new char[]{'+', '-'};
   private com.aspose.slides.ms.System.c4 l6 = new com.aspose.slides.ms.System.c4();
   private com.aspose.slides.ms.System.c4 k5 = new com.aspose.slides.ms.System.c4();

   public d6(com.aspose.slides.ms.System.c4 var1, com.aspose.slides.ms.System.c4 var2) {
      var1.k7(this.k5);
      var2.k7(this.l6);
   }

   @Override
   public RuntimeException l6(Object var1, v5 var2) {
      com.aspose.slides.ms.System.c4 var3 = var2.c8().u3(var1).l6();
      return this.n5(var3.l6(), var2);
   }

   @Override
   public RuntimeException n5(com.aspose.slides.ms.System.c4 var1, v5 var2) {
      r5 var3 = var2.y4();
      int var4 = var3 != null ? var3.y4 : 0;
      e3m var5 = var2.c8();
      if (com.aspose.slides.ms.System.c4.t2(var1, this.l6) || com.aspose.slides.ms.System.c4.x8(var1, this.k5)) {
         return new OverflowException(com.aspose.slides.ms.System.Xml.v3.n5("Value '{0}' was either too large or too small for {1}.", var1, var2.j5()));
      } else if (var4 == 0) {
         return null;
      } else if ((var4 & 64) != 0 && com.aspose.slides.ms.System.c4.t2(var1, var5.u3(var3.h0))) {
         return new XmlSchemaException("The MaxInclusive constraint failed.", com.aspose.slides.ms.System.d1.n5);
      } else if ((var4 & 128) != 0 && com.aspose.slides.ms.System.c4.s7(var1, var5.u3(var3.c8))) {
         return new XmlSchemaException("The MaxExclusive constraint failed.", com.aspose.slides.ms.System.d1.n5);
      } else if ((var4 & 256) != 0 && com.aspose.slides.ms.System.c4.x8(var1, var5.u3(var3.t2))) {
         return new XmlSchemaException("The MinInclusive constraint failed.", com.aspose.slides.ms.System.d1.n5);
      } else if ((var4 & 512) != 0 && com.aspose.slides.ms.System.c4.n3(var1, var5.u3(var3.s7))) {
         return new XmlSchemaException("The MinExclusive constraint failed.", com.aspose.slides.ms.System.d1.n5);
      } else {
         return (var4 & 16) != 0 && !this.n5(var1.l6(), var3.a6, var5)
            ? new XmlSchemaException("The Enumeration constraint failed.", com.aspose.slides.ms.System.d1.n5)
            : this.n5(var1.l6(), var3.x8, var3.n3, (var4 & 1024) != 0, (var4 & 2048) != 0);
      }
   }

   @Override
   public RuntimeException n5(long var1, v5 var3) {
      com.aspose.slides.ms.System.c4 var4 = com.aspose.slides.internal.v6g.k5.s7(var1, 11).l6();
      return this.n5(var4.l6(), var3);
   }

   @Override
   public RuntimeException n5(int var1, v5 var2) {
      com.aspose.slides.ms.System.c4 var3 = com.aspose.slides.internal.v6g.k5.s7(var1, 9).l6();
      return this.n5(var3.l6(), var2);
   }

   @Override
   public RuntimeException n5(short var1, v5 var2) {
      com.aspose.slides.ms.System.c4 var3 = com.aspose.slides.internal.v6g.k5.s7(var1, 7).l6();
      return this.n5(var3.l6(), var2);
   }

   @Override
   public boolean n5(Object var1, ArrayList var2, v5 var3) {
      return this.n5(var3.c8().u3(var1).l6(), var2, var3.c8());
   }

   public final boolean n5(com.aspose.slides.ms.System.c4 var1, ArrayList var2, e3m var3) {
      for (int var4 = 0; var4 < var2.size(); var4++) {
         if (com.aspose.slides.ms.System.c4.c8(var1, var3.u3(var2.get_Item(var4)))) {
            return true;
         }
      }

      return false;
   }

   public final Exception n5(com.aspose.slides.ms.System.c4 var1, int var2, int var3, boolean var4, boolean var5) {
      com.aspose.slides.ms.System.c4 var6 = com.aspose.slides.ms.System.c4.u3(n5(10, var2), com.aspose.slides.internal.v6g.k5.s7(1, 9)).l6();
      int var7 = 0;
      if (com.aspose.slides.ms.System.c4.x8(var1, com.aspose.slides.internal.v6g.k5.s7(0, 9))) {
         com.aspose.slides.ms.System.c4.k5(var1.l6()).k7(var1);
      }

      while (com.aspose.slides.ms.System.c4.h0(com.aspose.slides.ms.System.c4.t2(var1.l6()), var1)) {
         com.aspose.slides.ms.System.c4.a6(var1, com.aspose.slides.internal.v6g.k5.s7(10, 9)).k7(var1);
         var7++;
      }

      if (!var4 || !com.aspose.slides.ms.System.c4.t2(var1, var6) && var7 <= var2) {
         return var5 && var7 > var3 ? new XmlSchemaException("The FractionDigits constraint failed.", com.aspose.slides.ms.System.d1.n5) : null;
      } else {
         return new XmlSchemaException("The TotalDigits constraint failed.", com.aspose.slides.ms.System.d1.n5);
      }
   }
}
