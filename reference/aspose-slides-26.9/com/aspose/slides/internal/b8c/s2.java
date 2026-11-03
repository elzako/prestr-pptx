package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;
import java.util.concurrent.atomic.AtomicReference;

public class s2 extends c2 {
   private static AtomicReference<com.aspose.slides.internal.r7c.c8> n5 = new AtomicReference<>();

   private static com.aspose.slides.internal.r7c.c8 n5() {
      if (n5.get() == null) {
         com.aspose.slides.internal.r7c.c8 var0 = new com.aspose.slides.internal.r7c.c8("^([a-zA-Z]{1,8})(-[a-zA-Z0-9]{1,8})*$", 0);
         n5.set(var0);
      }

      return n5.get();
   }

   public Exception n5(Object var1, v5 var2) {
      String var3 = var2.c8().t2(var1);
      return this.n5(var3, var2, true);
   }

   public Exception l6(String var1, v5 var2) {
      return this.n5(var1, var2, true);
   }

   public final Exception n5(String var1, v5 var2, boolean var3) {
      int var4 = var1.length();
      r5 var5 = var2.y4();
      int var6 = var5 != null ? var5.y4 : 0;
      Exception var7 = this.n5(var1, var2.n3(), var3);
      if (var7 != null) {
         return var7;
      }

      if (var6 != 0) {
         if ((var6 & 1) != 0 && var5.n5 != var4) {
            return new XmlSchemaException("The actual length is not equal to the specified length.", com.aspose.slides.ms.System.d1.n5);
         }

         if ((var6 & 2) != 0 && var4 < var5.l6) {
            return new XmlSchemaException("The actual length is less than the MinLength value.", com.aspose.slides.ms.System.d1.n5);
         }

         if ((var6 & 4) != 0 && var5.k5 < var4) {
            return new XmlSchemaException("The actual length is greater than the MaxLength value.", com.aspose.slides.ms.System.d1.n5);
         }

         if ((var6 & 16) != 0 && !this.n5(var1, var5.a6, var2)) {
            return new XmlSchemaException("The Enumeration constraint failed.", com.aspose.slides.ms.System.d1.n5);
         }
      }

      return null;
   }

   @Override
   public boolean n5(Object var1, ArrayList var2, v5 var3) {
      return this.n5(var3.c8().t2(var1), var2, var3);
   }

   private boolean n5(String var1, ArrayList var2, v5 var3) {
      if (var3.n3() == 28) {
         for (int var4 = 0; var4 < var2.size(); var4++) {
            if (com.aspose.slides.ms.System.d1.a6(var1, ((com.aspose.slides.ms.System.r8)var2.get_Item(var4)).m1())) {
               return true;
            }
         }
      } else {
         for (int var5 = 0; var5 < var2.size(); var5++) {
            if (com.aspose.slides.ms.System.d1.a6(var1, (String)var2.get_Item(var5))) {
               return true;
            }
         }
      }

      return false;
   }

   private Exception n5(String var1, int var2, boolean var3) {
      Exception var4 = null;
      switch (var2) {
         case 28:
            if (var3) {
               com.aspose.slides.ms.System.r8 var5 = null;
               com.aspose.slides.ms.System.r8[] var6 = new com.aspose.slides.ms.System.r8[]{var5};
               var4 = com.aspose.slides.ms.System.Xml.f4.n5(var1, var6);
               var5 = var6[0];
            }
         case 29:
         case 30:
         default:
            break;
         case 31:
            var4 = com.aspose.slides.ms.System.Xml.f4.c8(var1);
            break;
         case 32:
            var4 = com.aspose.slides.ms.System.Xml.f4.u9(var1);
            break;
         case 33:
            if (var1 == null || var1.length() == 0) {
               return new XmlSchemaException("The attribute value cannot be empty.", com.aspose.slides.ms.System.d1.n5);
            }

            if (!n5().u3(var1)) {
               return new XmlSchemaException("'{0}' is an invalid language identifier.", com.aspose.slides.ms.System.d1.n5);
            }
            break;
         case 34:
            var4 = com.aspose.slides.ms.System.Xml.f4.h0(var1);
            break;
         case 35:
            var4 = com.aspose.slides.ms.System.Xml.f4.l6(var1);
            break;
         case 36:
         case 37:
         case 38:
         case 39:
            var4 = com.aspose.slides.ms.System.Xml.f4.u3(var1);
      }

      return var4;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public Exception n5(String bridgeArg0, v5 bridgeArg1) {
      return this.l6(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public Exception l6(Object bridgeArg0, v5 bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
