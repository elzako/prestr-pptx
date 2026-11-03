package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.XmlException;

public class x9 extends a0 {
   private static final com.aspose.slides.ms.System.y8 e2 = com.aspose.slides.internal.v6g.k5.n5(byte[].class);
   private static final com.aspose.slides.ms.System.y8 t9 = com.aspose.slides.internal.v6g.k5.n5(byte[][].class);

   @Override
   public e3m l6(j9e var1) {
      return e4.n5(var1);
   }

   @Override
   public c2 h0() {
      return u9;
   }

   @Override
   public int n3() {
      return 26;
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
      return 63;
   }

   @Override
   public int l6(Object var1, Object var2) {
      return this.n5(com.aspose.slides.internal.v6g.k5.k5(var1, byte[].class), com.aspose.slides.internal.v6g.k5.k5(var2, byte[].class));
   }

   @Override
   public RuntimeException n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3, Object[] var4) {
      var4[0] = null;
      String[] var5 = new String[]{var1};
      RuntimeException var6 = u9.n5(var5, this);
      var1 = var5[0];
      if (var6 != null) {
         return var6;
      }

      byte[] var7 = null;

      try {
         var7 = com.aspose.slides.ms.System.Xml.f4.n5(var1, false);
      } catch (ArgumentException var9) {
         return var9;
      } catch (XmlException var10) {
         return var10;
      }

      var6 = u9.l6(var7, this);
      if (var6 != null) {
         return var6;
      }

      var4[0] = var7;
      return null;
   }
}
