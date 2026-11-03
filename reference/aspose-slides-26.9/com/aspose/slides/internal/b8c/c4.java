package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XmlSchemaException;

public class c4 extends a0 {
   private static final com.aspose.slides.ms.System.y8 e2 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.Xml.k6.class);
   private static final com.aspose.slides.ms.System.y8 t9 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.Xml.k6[].class);

   @Override
   public e3m l6(j9e var1) {
      return e4.n5(var1);
   }

   @Override
   public c2 h0() {
      return s7;
   }

   @Override
   public int n3() {
      return 29;
   }

   @Override
   public int t2() {
      return 10;
   }

   @Override
   public int q0() {
      return 63;
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
   public RuntimeException n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3, Object[] var4) {
      var4[0] = null;
      if (var1 != null && var1.length() != 0) {
         String[] var5 = new String[]{var1};
         RuntimeException var6 = s7.n5(var5, this);
         var1 = var5[0];
         if (var6 != null) {
            return var6;
         }

         com.aspose.slides.ms.System.Xml.k6 var7 = null;

         try {
            String var8 = null;
            String[] var9 = new String[]{var8};
            var7 = com.aspose.slides.ms.System.Xml.k6.n5(var1, var3, var9);
            var8 = var9[0];
         } catch (ArgumentException var10) {
            return var10;
         } catch (XmlException var11) {
            return var11;
         }

         var6 = s7.n5(var7, this);
         if (var6 != null) {
            return var6;
         }

         var4[0] = var7;
         return null;
      } else {
         return new XmlSchemaException("The attribute value cannot be empty.", com.aspose.slides.ms.System.d1.n5);
      }
   }
}
