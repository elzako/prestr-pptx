package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;

class i0r {
   private final String[] n5;
   private int l6 = 0;
   private d2k k5;
   private d2k u3;
   private final IGenericList<d2k> a6;

   private i0r(String[] var1, IGenericList<d2k> var2) {
      this.k5 = d2k.k5.u3();
      this.u3 = d2k.k5.u3();
      this.n5 = var1;
      this.a6 = var2;
   }

   public static f1m[] n5(String var0, IGenericList<d2k> var1) {
      List var2 = new List();
      i0r var3 = new i0r(com.aspose.slides.ms.System.d1.u3(var0), var1);
      char var4 = ' ';

      while (true) {
         String var5 = null;
         String[] var6 = new String[]{var5};
         boolean var7 = !var3.n5(var6);
         var5 = var6[0];
         if (var7) {
            break;
         }

         char var8 = ' ';
         if (var5.length() == 1) {
            var8 = var5.charAt(0);
         }

         Object var9 = null;
         f1m[] var10 = new f1m[]{(f1m)var9};
         boolean var11 = var3.n5(var8, var10);
         f1m var14 = var10[0];
         if (var11) {
            if (var14 == null) {
               break;
            }

            var2.addItem(var14);
            var4 = var8;
         } else {
            var3.l6--;
            var10[0] = var14;
            boolean var12 = var3.n5(var4, var10);
            var14 = var10[0];
            if (!var12) {
               throw new NotImplementedException();
            }

            var2.addItem(var14);
         }
      }

      return (f1m[])var2.toArray(new f1m[0]);
   }

   private String n5() {
      return this.n5[this.l6++];
   }

   private boolean n5(String[] var1) {
      if (this.l6 < this.n5.length) {
         var1[0] = this.n5[this.l6++];
         return true;
      } else {
         var1[0] = null;
         return false;
      }
   }

   private int n5(boolean var1) {
      return this.n5(var1, true);
   }

   private int n5(boolean var1, boolean var2) {
      float var3 = n5(this.n5());
      float var4 = n5(this.n5());
      d2k var5 = new d2k(var3, var4);
      return this.n5(var5.u3(), var1, var2);
   }

   private int n5(d2k var1, boolean var2, boolean var3) {
      if (var2) {
         d2k.n5(var1, this.u3).n5(var1);
      }

      var1.n5(this.k5);
      if (var3) {
         this.k5.n5(this.u3);
      }

      this.a6.addItem(var1.u3());
      return this.a6.size() - 1;
   }

   private boolean n5(char var1, f1m[] var2) {
      boolean var3 = com.aspose.slides.ms.System.t9.c8(var1);
      switch (var1) {
         case 'H':
         case 'h':
            d2k var7 = new d2k(n5(this.n5()), 0.0F);
            int var9 = this.n5(var7.u3(), var3, true);
            var2[0] = new f1m(5, var9);
            return true;
         case 'I':
         case 'J':
         case 'K':
         case 'N':
         case 'O':
         case 'P':
         case 'R':
         case 'S':
         case 'U':
         case 'W':
         case 'X':
         case 'Y':
         case '[':
         case '\\':
         case ']':
         case '^':
         case '_':
         case '`':
         case 'a':
         case 'b':
         case 'c':
         case 'd':
         case 'e':
         case 'f':
         case 'g':
         case 'i':
         case 'j':
         case 'k':
         case 'n':
         case 'o':
         case 'p':
         case 'r':
         case 's':
         case 'u':
         case 'w':
         case 'x':
         case 'y':
         default:
            var2[0] = null;
            return false;
         case 'L':
         case 'l':
            var2[0] = new f1m(2, this.n5(var3));
            return true;
         case 'M':
         case 'm':
            var2[0] = new f1m(0, this.n5(var3));
            return true;
         case 'Q':
         case 'q':
            int var6 = this.n5(var3, false);
            int var8 = this.n5(var3);
            var2[0] = new f1m(1, var6, var8);
            return true;
         case 'T':
         case 't':
            var2[0] = new f1m(3, this.n5(var3));
            return true;
         case 'V':
         case 'v':
            d2k var4 = new d2k(0.0F, n5(this.n5()));
            int var5 = this.n5(var4.u3(), var3, true);
            var2[0] = new f1m(6, var5);
            return true;
         case 'Z':
         case 'z':
            var2[0] = new f1m(4);
            return true;
      }
   }

   private static float n5(String var0) {
      return com.aspose.slides.ms.System.n1.n5(var0, com.aspose.slides.internal.x7n.l6.k5());
   }
}
