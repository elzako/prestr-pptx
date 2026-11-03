package com.aspose.slides.internal.q8o;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.internal.y4g.v0;
import com.aspose.slides.internal.y4g.v8;
import com.aspose.slides.internal.y4g.z6;
import com.aspose.slides.ms.System.d1;

public class u9 extends com.aspose.slides.internal.n4m.n5 {
   private com.aspose.slides.internal.i2i.k5 n5;

   public u9(v8 var1, byte[] var2) {
      super(var1, (byte)11, var2);
   }

   @Override
   public void c8() {
      super.c8();
      this.x8().x8().n5(this.n5);
      this.x8().x8().u9();
   }

   @Override
   protected void t2() {
      this.s7();
   }

   @Override
   protected void s7() {
      this.n5 = new com.aspose.slides.internal.i2i.k5();
      int var1 = 0;
      int var2 = this.u3();

      while (var1 < var2) {
         int var3 = this.u3();
         var1 += 3;
         if (var3 > 0) {
            byte[] var4 = this.n5(var3);
            com.aspose.slides.internal.i2i.l6 var5 = new com.aspose.slides.internal.i2i.l6(var4);
            this.n5.n5(var5);
            var1 += var3;
         }
      }

      this.n5(this.n5);
   }

   private boolean n5(com.aspose.slides.internal.i2i.l6 var1) {
      z6 var2 = (z6)this.x8();
      if (var1.z1() < 3) {
         return true;
      }

      short var3 = 0;
      switch (var2.p8().n5().c8()) {
         case 0:
            var3 = 8;
            break;
         case 1:
            return false;
         case 2:
         default:
            break;
         case 3:
            var3 = 32;
            break;
         case 4:
            var3 = 128;
      }

      com.aspose.slides.internal.b5x.l6 var4 = null;
      com.aspose.slides.internal.b5x.n5 var5 = null;
      com.aspose.slides.internal.i2i.a6 var6 = var1.l6().l6("2.5.29.15");
      if (var6 != null) {
         var4 = new com.aspose.slides.internal.b5x.l6(var6);
      }

      var6 = var1.l6().l6("2.5.29.37");
      if (var6 != null) {
         var5 = new com.aspose.slides.internal.b5x.n5(var6);
      }

      if (var4 != null && var5 != null) {
         return !var4.n5(var3) ? false : var5.u9().contains("1.3.6.1.5.5.7.3.1") || var5.u9().contains("2.16.840.1.113730.4.1");
      }

      if (var4 != null) {
         return var4.n5(var3);
      }

      if (var5 == null) {
         var6 = var1.l6().l6("2.16.840.1.113730.1.1");
         if (var6 != null) {
            com.aspose.slides.internal.b5x.k5 var7 = new com.aspose.slides.internal.b5x.k5(var6);
            return var7.n5(64);
         } else {
            return true;
         }
      } else {
         return var5.u9().contains("1.3.6.1.5.5.7.3.1") || var5.u9().contains("2.16.840.1.113730.4.1");
      }
   }

   private void n5(com.aspose.slides.internal.i2i.k5 var1) {
      z6 var2 = (z6)this.x8();
      byte var3 = 42;
      if (var2.n5().u3()) {
         this.n5(var2, var3);
      } else {
         this.l6(var2, var3);
      }
   }

   private void n5(z6 var1, byte var2) {
      v0 var3 = var1.n5().l6(this.n5);
      if (!var3.n5()) {
         long var4 = var3.l6();
         switch ((int)var4) {
            case -2146762495:
               var2 = 45;
               break;
            case -2146762487:
               var2 = 48;
               break;
            case -2146762486:
               var2 = 48;
               break;
            default:
               var2 = 46;
         }

         String var6 = d1.n5("Invalid certificate received from server. Error code: 0x{0:x}", new Object[]{com.aspose.slides.internal.v6g.k5.n5(var4)});
         throw new com.aspose.slides.internal.y4g.n5(var2, var6);
      }
   }

   private void l6(z6 var1, byte var2) {
      com.aspose.slides.internal.i2i.l6 var3 = this.n5.n5(0);
      com.aspose.slides.internal.f3c.u9 var4 = new com.aspose.slides.internal.f3c.u9(var3.t2());
      ArrayList var5 = new ArrayList();
      if (!this.n5(var3)) {
         var5.addItem(com.aspose.slides.internal.v6g.k5.l6(-2146762490));
      }

      if (!this.l6(var3)) {
         var5.addItem(com.aspose.slides.internal.v6g.k5.l6(-2146762481));
      }

      com.aspose.slides.internal.i2i.k5 var6 = new com.aspose.slides.internal.i2i.k5(this.n5);
      var6.u3(var3);
      com.aspose.slides.internal.i2i.u3 var7 = new com.aspose.slides.internal.i2i.u3(var6);
      boolean var8 = false;

      try {
         var8 = var7.n5(var3);
      } catch (RuntimeException var10) {
         var8 = false;
      }

      if (!var8) {
         switch (var7.n5()) {
            case 1:
               var2 = 45;
               var5.addItem(com.aspose.slides.internal.v6g.k5.l6(-2146762495));
               break;
            case 2:
               var5.addItem(com.aspose.slides.internal.v6g.k5.l6(-2146762494));
               break;
            case 8:
               var5.addItem(com.aspose.slides.internal.v6g.k5.l6(-2146869232));
               break;
            case 32:
               var2 = 48;
               var5.addItem(com.aspose.slides.internal.v6g.k5.l6(-2146762487));
               break;
            case 1024:
               var5.addItem(com.aspose.slides.internal.v6g.k5.l6(-2146869223));
               break;
            case 65536:
               var2 = 48;
               var5.addItem(com.aspose.slides.internal.v6g.k5.l6(-2146762486));
               break;
            default:
               var2 = 46;
               var5.addItem(com.aspose.slides.internal.v6g.k5.l6(var7.n5()));
         }
      }

      int[] var9 = com.aspose.slides.internal.v6g.k5.k5(var5.toArray(com.aspose.slides.internal.v6g.k5.n5(int.class)), int[].class);
      if (!var1.n5().n5(var4, var9)) {
         throw new com.aspose.slides.internal.y4g.n5(var2, "Invalid certificate received from server.");
      }
   }

   private boolean l6(com.aspose.slides.internal.i2i.l6 var1) {
      z6 var2 = (z6)this.x8();
      String var3 = var2.n3().n5();
      com.aspose.slides.internal.i2i.a6 var4 = var1.l6().l6("2.5.29.17");
      if (var4 != null) {
         com.aspose.slides.internal.b5x.u3 var5 = new com.aspose.slides.internal.b5x.u3(var4);

         for (String var9 : var5.u9()) {
            if (n5(var3, var9)) {
               return true;
            }
         }

         for (String var13 : var5.h0()) {
            if (d1.a6(var13, var3)) {
               return true;
            }
         }
      }

      return this.n5(var1.y4());
   }

   private boolean n5(String var1) {
      z6 var2 = (z6)this.x8();
      String var3 = d1.n5;
      com.aspose.slides.internal.r7c.c8 var4 = new com.aspose.slides.internal.r7c.c8("CN\\s*=\\s*([^,]*)");
      com.aspose.slides.internal.r7c.u9 var5 = var4.k5(var1);
      if (var5.n5() == 1 && var5.n5(0).u3()) {
         var3 = var5.n5(0).a6().n5(1).k5().toString();
      }

      return n5(var2.n3().n5(), var3);
   }

   static boolean n5(String var0, String var1) {
      int var2 = d1.u3(var1, '*');
      if (var2 == -1) {
         return d1.n5(var0, var1, true, com.aspose.slides.internal.x7n.l6.k5()) == 0;
      } else if (var2 != var1.length() - 1 && var1.charAt(var2 + 1) != '.') {
         return false;
      } else {
         int var3 = d1.l6(var1, '*', var2 + 1);
         if (var3 != -1) {
            return false;
         } else {
            String var4 = d1.k5(var1, var2 + 1);
            int var5 = var0.length() - var4.length();
            if (var5 <= 0) {
               return false;
            } else if (d1.n5(var0, var5, var4, 0, var4.length(), true, com.aspose.slides.internal.x7n.l6.k5()) != 0) {
               return false;
            } else if (var2 != 0) {
               String var7 = d1.l6(var1, 0, var2);
               return d1.n5(var0, 0, var7, 0, var7.length(), true, com.aspose.slides.internal.x7n.l6.k5()) == 0;
            } else {
               int var6 = d1.u3(var0, '.');
               return var6 == -1 || var6 >= var0.length() - var4.length();
            }
         }
      }
   }
}
