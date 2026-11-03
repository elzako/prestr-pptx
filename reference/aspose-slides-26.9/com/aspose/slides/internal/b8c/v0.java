package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.XmlSchemaException;

public class v0 extends a0 {
   private static final com.aspose.slides.ms.System.y8 e2 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.s4.class);
   private static final com.aspose.slides.ms.System.y8 t9 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.s4[].class);

   @Override
   public e3m l6(j9e var1) {
      return e4.n5(var1);
   }

   @Override
   public c2 h0() {
      return c8;
   }

   @Override
   public int n3() {
      return 17;
   }

   @Override
   public com.aspose.slides.ms.System.y8 s7() {
      return e2;
   }

   @Override
   public com.aspose.slides.ms.System.y8 t4() {
      return t9;
   }

   @Override
   public int z3() {
      return 2;
   }

   @Override
   public int q0() {
      return 1016;
   }

   @Override
   public int l6(Object var1, Object var2) {
      return this.n5(
         com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.s4.class),
         com.aspose.slides.internal.v6g.k5.u3(var2, com.aspose.slides.ms.System.s4.class)
      );
   }

   public int n5(com.aspose.slides.ms.System.s4 var1, com.aspose.slides.ms.System.s4 var2) {
      return var1.l6(var2);
   }

   @Override
   public RuntimeException n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3, Object[] var4) {
      var4[0] = null;
      if (var1 != null && var1.length() != 0) {
         String[] var5 = new String[]{var1};
         RuntimeException var6 = c8.n5(var5, this);
         var1 = var5[0];
         if (var6 != null) {
            return var6;
         }

         com.aspose.slides.ms.System.s4 var7 = new com.aspose.slides.ms.System.s4();
         com.aspose.slides.ms.System.s4[] var8 = new com.aspose.slides.ms.System.s4[]{var7};
         var6 = com.aspose.slides.ms.System.Xml.f4.n5(var1, var8);
         var8[0].u3(var7);
         if (var6 != null) {
            return var6;
         }

         var6 = c8.n5(var7.n3(), this);
         if (var6 != null) {
            return var6;
         }

         var7.u3((com.aspose.slides.ms.System.s4)var4[0]);
         return null;
      } else {
         return new XmlSchemaException("The attribute value cannot be empty.", com.aspose.slides.ms.System.d1.n5);
      }
   }
}
