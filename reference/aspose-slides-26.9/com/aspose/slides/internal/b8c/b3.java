package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.FormatException;

public class b3 extends a0 {
   private static final com.aspose.slides.ms.System.y8 e2 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.j5.class);
   private static final com.aspose.slides.ms.System.y8 t9 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.j5[].class);
   private int z1;

   @Override
   public e3m l6(j9e var1) {
      return l7.n5(var1);
   }

   @Override
   public c2 h0() {
      return h0;
   }

   @Override
   public int n3() {
      return 18;
   }

   public b3(int var1) {
      this.z1 = var1;
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
      com.aspose.slides.ms.System.j5 var3 = com.aspose.slides.internal.v6g.k5.u3(var1, com.aspose.slides.ms.System.j5.class).m3();
      com.aspose.slides.ms.System.j5 var4 = com.aspose.slides.internal.v6g.k5.u3(var2, com.aspose.slides.ms.System.j5.class).m3();
      if (var3.a6() != 0L && var4.a6() != 0L) {
         var3.k7().u3(var3);
         return var3.n5(var4.k7().m3());
      } else {
         return var3.n5(var4.m3());
      }
   }

   @Override
   public RuntimeException n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3, Object[] var4) {
      var4[0] = null;
      String[] var5 = new String[]{var1};
      RuntimeException var6 = h0.n5(var5, this);
      var1 = var5[0];
      if (var6 != null) {
         return var6;
      }

      r6o var7 = new r6o();
      r6o[] var8 = new r6o[]{var7};
      boolean var9 = !r6o.n5(var1, this.z1, var8);
      var8[0].k5(var7);
      if (var9) {
         return new FormatException(
            com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var1, com.aspose.slides.ms.System.s3.n5(v6s.class, this.z1))
         );
      }

      com.aspose.slides.ms.System.j5 var10 = com.aspose.slides.ms.System.j5.l6.m3();

      try {
         r6o.n5(var7).u3(var10);
      } catch (ArgumentException var12) {
         return var12;
      }

      var6 = h0.l6(var10.m3(), this);
      if (var6 != null) {
         return var6;
      }

      var10.u3((com.aspose.slides.ms.System.j5)var4[0]);
      return null;
   }
}
