package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;

public abstract class c2 {
   public RuntimeException n5(String[] var1, v5 var2) {
      this.l6(var1, var2);
      return this.n5(var2.y4(), var1[0]);
   }

   public RuntimeException l6(Object var1, v5 var2) {
      return null;
   }

   public RuntimeException n5(com.aspose.slides.ms.System.c4 var1, v5 var2) {
      return null;
   }

   public RuntimeException n5(long var1, v5 var3) {
      return null;
   }

   public RuntimeException n5(int var1, v5 var2) {
      return null;
   }

   public RuntimeException n5(short var1, v5 var2) {
      return null;
   }

   public RuntimeException l6(com.aspose.slides.ms.System.j5 var1, v5 var2) {
      return null;
   }

   public RuntimeException n5(double var1, v5 var3) {
      return null;
   }

   public RuntimeException n5(float var1, v5 var2) {
      return null;
   }

   public RuntimeException n5(String var1, v5 var2) {
      return null;
   }

   public RuntimeException l6(byte[] var1, v5 var2) {
      return null;
   }

   public Exception n5(com.aspose.slides.ms.System.s4 var1, v5 var2) {
      return null;
   }

   public Exception n5(com.aspose.slides.ms.System.Xml.k6 var1, v5 var2) {
      return null;
   }

   public final void l6(String[] var1, v5 var2) {
      r5 var3 = var2.y4();
      switch (var2.x8()) {
         case 0:
            if (var2.z3() == 2) {
               var1[0] = com.aspose.slides.ms.System.Xml.a8.n5(var1[0]);
            } else if (var2.z3() == 1) {
               var1[0] = com.aspose.slides.ms.System.Xml.a8.l6(var1[0]);
            } else if (var3 != null && (var3.y4 & 32) != 0) {
               if (var3.u9 == 1) {
                  var1[0] = com.aspose.slides.ms.System.Xml.a8.l6(var1[0]);
               } else if (var3.u9 == 2) {
                  var1[0] = com.aspose.slides.ms.System.Xml.a8.n5(var1[0]);
               }
            }
            break;
         case 1:
            var1[0] = com.aspose.slides.ms.System.d1.l6(var1[0]);
      }
   }

   public final Exception n5(r5 var1, String var2) {
      if (var1 != null && (var1.y4 & 8) != 0) {
         for (int var3 = 0; var3 < var1.u3.size(); var3++) {
            com.aspose.slides.internal.r7c.c8 var4 = (com.aspose.slides.internal.r7c.c8)var1.u3.get_Item(var3);
            if (!var4.u3(var2)) {
               return new XmlSchemaException("The Pattern constraint failed.", com.aspose.slides.ms.System.d1.n5);
            }
         }
      }

      return null;
   }

   public boolean n5(Object var1, ArrayList var2, v5 var3) {
      return false;
   }

   public r5 n5(t4 var1, z4 var2, com.aspose.slides.ms.System.Xml.z9 var3) {
      r5 var4 = new r5();
      c2$n5 var5 = new c2$n5(var1, var4);

      for (int var6 = 0; var6 < var2.size(); var6++) {
         m6 var7 = (m6)var2.n5(var6);
         if (var7.n5() == null) {
            throw new XmlSchemaException("The 'value' attribute must be present in facet.", var7);
         }

         e0 var8 = new e0(var7);
         switch (var7.u9()) {
            case 1:
               var5.n5(var7);
               break;
            case 2:
               var5.l6(var7);
               break;
            case 3:
               var5.k5(var7);
               break;
            case 4:
               var5.n5(com.aspose.slides.internal.v6g.k5.n5(var7, c0.class));
               break;
            case 5:
               var5.u3(var7);
               break;
            case 6:
               var5.n5(var7, var8, var3);
               break;
            case 7:
               var5.c8(var7);
               break;
            case 8:
               var5.h0(var7);
               break;
            case 9:
               var5.u9(var7);
               break;
            case 10:
               var5.a6(var7);
               break;
            case 11:
               var5.t2(var7);
               break;
            case 12:
               var5.s7(var7);
               break;
            default:
               throw new XmlSchemaException("This is an unknown facet.", var7);
         }
      }

      var5.n5();
      var5.l6();
      return var4;
   }

   public static com.aspose.slides.ms.System.c4 n5(int var0, int var1) {
      com.aspose.slides.ms.System.c4 var2 = new com.aspose.slides.ms.System.c4("1").l6();
      com.aspose.slides.ms.System.c4 var3 = com.aspose.slides.internal.v6g.k5.s7(var0, 9).l6();
      if (var1 > 28) {
         return com.aspose.slides.ms.System.c4.l6;
      }

      for (int var4 = 0; var4 < var1; var4++) {
         com.aspose.slides.ms.System.c4.a6(var2, var3).k7(var2);
      }

      return var2;
   }
}
