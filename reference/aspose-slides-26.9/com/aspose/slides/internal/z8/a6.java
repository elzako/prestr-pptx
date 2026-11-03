package com.aspose.slides.internal.z8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.k5.t1;
import com.aspose.slides.internal.k5.u6;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.x8.b3;
import com.aspose.slides.internal.x8.g7;
import com.aspose.slides.internal.x8.o0;
import com.aspose.slides.internal.x8.v8;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import java.io.ByteArrayInputStream;

public class a6 implements e2 {
   private t9 n5;
   private t4 l6;
   private z1 k5;
   private v8 u3 = v8.n5();
   private com.aspose.slides.internal.x8.c4 a6 = com.aspose.slides.internal.x8.c4.n5();
   private com.aspose.slides.internal.h0.y4 u9 = com.aspose.slides.internal.h0.y4.n5();
   private com.aspose.slides.internal.h0.h0 h0;
   private com.aspose.slides.internal.j3.z8 c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "first-child",
      "last-child",
      "only-child",
      "first-of-type",
      "last-of-type",
      "only-of-type",
      "root",
      "nth-child(",
      "nth-last-child(",
      "nth-of-type(",
      "nth-last-of-type(",
      "lang(",
      "not(",
      "enabled",
      "disabled",
      "checked",
      "indeterminate",
      "valid",
      "invalid",
      "required",
      "optional",
      "in-range",
      "out-of-range",
      "read-only",
      "read-write",
      "dir(",
      "empty",
      "link",
      "target",
      "selection",
      "hover",
      "focus",
      "first-line",
      "first-letter",
      "before",
      "after"
   );

   public a6(com.aspose.slides.internal.h0.h0 var1) {
      this(var1, null);
   }

   public a6(com.aspose.slides.internal.h0.h0 var1, com.aspose.slides.internal.j3.z8 var2) {
      this.k5 = var1.u3();
      this.h0 = var1;
      this.c8 = var2;
      l6 var3 = new l6(this, var1, var2);
      this.n5 = var3;
      this.l6 = var3;
   }

   public final com.aspose.slides.internal.k5.j5 n5(String var1) {
      try {
         com.aspose.slides.internal.e2.k5 var2 = new com.aspose.slides.internal.e2.k5(
            new com.aspose.slides.internal.n5.s7(new com.aspose.slides.internal.e2.l6(new com.aspose.slides.internal.n5.k5(var1)))
         );
         com.aspose.slides.internal.l6.u3 var5 = var2.h0();
         return this.n5(var5);
      } catch (Throwable var4) {
         this.n5(var4);
         com.aspose.slides.internal.h0.q0 var3 = (com.aspose.slides.internal.h0.q0)((com.aspose.slides.internal.k5.y2)this.c8.c4().u9()).n5(d1.n5, "all");
         var3.n5(this.h0, this.c8);
         return var3;
      }
   }

   public final com.aspose.slides.internal.k5.j5 n5(com.aspose.slides.internal.z0k.t4 var1) {
      try {
         com.aspose.slides.internal.z0k.m3 var2 = new com.aspose.slides.internal.z0k.m3(var1, com.aspose.slides.internal.l7h.j5.z3());
         String var8 = var2.c8();
         var2.u3();
         com.aspose.slides.internal.n5.n5 var4 = new com.aspose.slides.internal.n5.n5(new ByteArrayInputStream(var8.getBytes("UTF-8")));
         com.aspose.slides.internal.e2.k5 var5 = new com.aspose.slides.internal.e2.k5(
            new com.aspose.slides.internal.n5.s7(new com.aspose.slides.internal.e2.l6(var4))
         );
         com.aspose.slides.internal.l6.u3 var6 = var5.h0();
         return this.n5(var6);
      } catch (Throwable var7) {
         this.n5(var7);
         com.aspose.slides.internal.h0.q0 var3 = (com.aspose.slides.internal.h0.q0)((com.aspose.slides.internal.k5.y2)this.c8.c4().u9()).n5(d1.n5, "all");
         var3.n5(this.h0, this.c8);
         return var3;
      }
   }

   public final com.aspose.slides.internal.k5.m3 l6(String var1) {
      try {
         com.aspose.slides.internal.e2.k5 var2 = new com.aspose.slides.internal.e2.k5(
            new com.aspose.slides.internal.n5.s7(new com.aspose.slides.internal.e2.l6(new com.aspose.slides.internal.n5.k5(var1)))
         );
         com.aspose.slides.internal.l6.u3 var3 = var2.c8();
         return this.l6(var3);
      } catch (Throwable var4) {
         this.n5(var4);
         return new com.aspose.slides.internal.h0.m1(this.h0);
      }
   }

   @Override
   public final com.aspose.slides.internal.h0.y4 n5() {
      return this.u9;
   }

   private void n5(Throwable var1) {
      if (this.c8 == null) {
         throw new IllegalStateException("Standalone stylesheet parsing failed", var1);
      }
      this.k5.l6(new u3(var1.getMessage(), var1));
   }

   private void n5(Exception var1) {
      this.k5.n5(new u3(var1.getMessage()));
   }

   private void k5(String var1) {
      this.k5.n5(new u3(var1));
   }

   private void u3(String var1) {
      this.k5.n5(new u3(d1.n5("The character '{0}' is not valid in the current state.", new Object[]{var1})));
   }

   private com.aspose.slides.internal.k5.j5 n5(com.aspose.slides.internal.l6.n3 var1) {
      this.n5.k5();
      if (!this.q0(var1)) {
         int var2 = var1.n5();

         for (int var3 = 0; var3 < var2; var3++) {
            try {
               this.k5(var1.n5(var3));
            } catch (m3 var5) {
               this.n5(var5);
            } catch (m1 var6) {
               this.n5(var6);
            }
         }
      }

      this.n5.u3();
      return ((l6)this.n5).n5();
   }

   private com.aspose.slides.internal.k5.m3 l6(com.aspose.slides.internal.l6.n3 var1) {
      t4 var2 = this.l6;

      try {
         k5 var3 = new k5(this.h0, this.c8);
         this.l6 = var3;
         int var4 = 0;

         while (var4 < var1.n5()) {
            com.aspose.slides.internal.l6.n3 var5 = var1.n5(var4++);
            if (19 == var5.s7()) {
               this.y4(var5);
            }
         }

         return var3.n5();
      } finally {
         if (!j8.l6(this.l6, var2)) {
            this.l6 = var2;
         }
      }
   }

   private void k5(com.aspose.slides.internal.l6.n3 var1) {
      switch (var1.s7()) {
         case 0:
            this.k5(var1.x8());
            return;
         case 10:
            this.n3(var1);
            break;
         case 24:
         case 25:
            this.k5(var1.x8());
            break;
         case 30:
            this.a6(var1);
            break;
         case 32:
            this.h0(var1);
            break;
         case 39:
            this.c8(var1);
            break;
         case 43:
            this.u9(var1);
            break;
         case 45:
            this.u3(var1);
            break;
         case 46:
            this.x8(var1);
            break;
         case 49:
            this.s7(var1);
            break;
         case 52:
            this.t2(var1);
      }
   }

   private void u3(com.aspose.slides.internal.l6.n3 var1) {
      try {
         List var2 = new List();

         int var3;
         for (var3 = 0; var3 < var1.n5(); var3++) {
            com.aspose.slides.internal.l6.n3 var4 = var1.n5(var3);
            if (var4.s7() == 27) {
               k7 var5 = new k7();
               com.aspose.slides.internal.c8.l6 var6 = var5.n5(var4);
               if (var6 != null) {
                  var2.addItem(var6);
               }
            } else if (var4.s7() == 10) {
               break;
            }
         }

         this.n5.n5(var2);

         for (; var3 < var1.n5(); var3++) {
            com.aspose.slides.internal.l6.n3 var8 = var1.n5(var3);
            if (var8.s7() == 10) {
               this.k5(var8);
            }
         }

         this.n5.u9();
      } catch (u3 var7) {
         this.n5(var7);
      }
   }

   private void a6(com.aspose.slides.internal.l6.n3 var1) {
      if (var1.n5() != 0) {
         com.aspose.slides.internal.l6.n3 var2 = var1.n5(0);
         if (var2.s7() != 44) {
            this.k5(d1.n5("Unexpected token type '{0}'.", new Object[]{com.aspose.slides.internal.e2.k5.k5[var1.s7()]}));
         }

         String var3 = var2.h0();
         var2 = var1.n5(1);
         if (var2.s7() != 19) {
            this.k5(d1.n5("Unexpected token type '{0}'.", new Object[]{com.aspose.slides.internal.e2.k5.k5[var1.s7()]}));
         }

         try {
            this.n5.n5(var3);
            com.aspose.slides.internal.h0.u9 var4 = (com.aspose.slides.internal.h0.u9)((l6)this.n5).l6();
            this.l6 = new c8(var4);
            this.y4(var2);
            this.n5.u9();
         } finally {
            if (!j8.l6(this.l6, this.n5)) {
               this.l6 = this.n5;
            }
         }
      }
   }

   private void u9(com.aspose.slides.internal.l6.n3 var1) {
      this.n5.h0();
      if (var1.n5() != 0) {
         com.aspose.slides.internal.l6.n3 var2 = var1.n5(0);
         if (var2.s7() != 19) {
            this.k5(d1.n5("Unexpected token type '{0}'.", new Object[]{com.aspose.slides.internal.e2.k5.k5[var1.s7()]}));
         }

         this.y4(var2);
      }

      this.n5.u9();
   }

   private void h0(com.aspose.slides.internal.l6.n3 var1) {
      String var2;
      String var3;
      if (var1.n5() == 1) {
         var2 = d1.n5;
         var1 = var1.n5(0);
         if (var1.s7() == 54) {
            var3 = com.aspose.slides.internal.z8.n5.u3(null, var1).t2();
         } else {
            var3 = com.aspose.slides.internal.z8.n5.n5(null, var1.x8()).t2();
         }
      } else {
         var2 = var1.n5(0).x8();
         var1 = var1.n5(1);
         if (var1.s7() == 54) {
            var3 = com.aspose.slides.internal.z8.n5.u3(null, var1).t2();
         } else {
            var3 = com.aspose.slides.internal.z8.n5.n5(null, var1.x8()).t2();
         }
      }

      this.n5.n5(var2, var3);
   }

   private void c8(com.aspose.slides.internal.l6.n3 var1) {
      String var2 = d1.l6(var1.x8(), 10, var1.x8().length() - 12);
      this.n5.l6(var2);
      this.n5.u9();
   }

   private void t2(com.aspose.slides.internal.l6.n3 var1) {
      String var2 = null;
      List var3 = new List();
      c4 var4 = new c4(var1, y2.n5(51, 36, 48));

      while (var4.hasNext()) {
         switch (var4.n5().s7()) {
            case 0:
               this.n5(com.aspose.slides.internal.z8.u9.n5(var1.x8()));
               return;
            case 27:
               k7 var17 = new k7();
               var3.addItem(var17.n5(var4.n5()));
               break;
            case 53:
               y4 var16 = com.aspose.slides.internal.z8.n5.n5(null, var4.n5().x8());
               var2 = var16.t2();
               break;
            case 54:
               y4 var5 = com.aspose.slides.internal.z8.n5.u3(null, var4.n5());
               var2 = var5.t2();
         }
      }

      com.aspose.slides.internal.h0.q0 var18 = (com.aspose.slides.internal.h0.q0)((l6)this.n5).n5();
      if (var18.l6().n5() != 0L) {
         IGenericEnumerator var6 = var18.l6().iterator();

         try {
            while (var6.hasNext()) {
               com.aspose.slides.internal.k5.q0 var7 = (com.aspose.slides.internal.k5.q0)var6.next();
               if (3 != var7.n5() && 2 != var7.n5()) {
                  this.n5(com.aspose.slides.internal.z8.u9.n5(d1.n5("Invalid @import position at line {0}.", new Object[]{var1.c8()})));
                  return;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }
      }

      this.n5.n5(var2, var3);
      t1 var20 = this.h0.k5().n5().n5(this.h0, new u6(var2));
      if (var20.n5() != null && var20.n5().length != 0) {
         com.aspose.slides.internal.z0k.e2 var21 = new com.aspose.slides.internal.z0k.e2(var20.n5());

         try {
            a6 var8 = new a6(this.h0);
            var18 = (com.aspose.slides.internal.h0.q0)var8.n5(var21);
            var18.n5(var2);
            this.n5.n5(var18);
         } finally {
            if (var21 != null) {
               var21.dispose();
            }
         }
      }

      this.n5.u9();
   }

   private void s7(com.aspose.slides.internal.l6.n3 var1) {
      this.n5.c8();
      int var2 = 0;
      g7 var3 = null;

      while (var2 < var1.n5()) {
         com.aspose.slides.internal.l6.n3 var4 = var1.n5(var2++);
         switch (var4.s7()) {
            case 13:
               var3 = this.n5(var4, var3);
               break;
            case 19:
               this.y4(var4);
               break;
            case 44:
               var3 = this.n5(var4, var3);
               break;
            default:
               this.k5(d1.n5("Unexpected token type '{0}'.", new Object[]{com.aspose.slides.internal.e2.k5.k5[var1.s7()]}));
         }
      }

      if (var3 != null) {
         this.n5.n5(new b3[]{var3});
      }

      this.n5.u9();
   }

   private void x8(com.aspose.slides.internal.l6.n3 var1) {
      a5 var2 = new a5();
      if (var1.n5() == 0) {
         var2.n5(var1.h0());
      } else {
         int var3 = 0;

         while (var3 < var1.n5()) {
            var2.n5(var1.n5(var3++).h0());
         }
      }

      this.n5.k5(var2.toString());
      this.n5.u9();
   }

   private void n3(com.aspose.slides.internal.l6.n3 var1) {
      List var2 = new List();
      g7 var3 = this.t9(var1.n5(0));
      int var4 = 1;
      com.aspose.slides.internal.l6.n3 var5 = null;
      boolean var6 = false;

      do {
         com.aspose.slides.internal.l6.n3 var7 = var1.n5(var4);
         switch (var7.s7()) {
            case 0:
            case 25:
               throw new m3(var7.x8());
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            default:
               break;
            case 11:
               var2.addItem(var3);
               var3 = this.t9(var7);
               break;
            case 14:
               var7 = var1.n5(++var4);
               var3 = this.u3.l6((b3)var3, (b3)this.t9(var7));
               break;
            case 15:
               var7 = var1.n5(++var4);
               var3 = this.u3.k5(var3, this.t9(var7));
               break;
            case 16:
               var7 = var1.n5(++var4);
               var3 = this.u3.n5(var3, this.t9(var7));
               break;
            case 17:
               var7 = var1.n5(++var4);
               var3 = this.u3.n5((b3)var3, (b3)this.t9(var7));
               break;
            case 19:
               var5 = var7;
               var6 = true;
         }
      } while (++var4 < var1.n5() && !var6);

      this.n5.a6();
      var2.addItem(var3);
      this.n5.n5((b3[])var2.toArray(new b3[0]));
      if (var5 != null) {
         this.y4(var5);
      }

      this.n5.u9();
   }

   private void y4(com.aspose.slides.internal.l6.n3 var1) {
      int var2 = var1.n5();

      for (int var3 = 0; var3 < var2; var3++) {
         com.aspose.slides.internal.l6.n3 var4 = var1.n5(var3);
         if (var4.s7() == 0) {
            this.k5(d1.n5("Unexpected token type '{0}'.", new Object[]{var4.x8()}));
            return;
         }

         if (var4.s7() != 20) {
            this.k5(d1.n5("Unexpected token type '{0}'.", new Object[]{com.aspose.slides.internal.e2.k5.k5[var4.s7()]}));
         } else {
            this.e2(var4);
         }
      }
   }

   private void e2(com.aspose.slides.internal.l6.n3 var1) {
      if (var1.n5() <= 1) {
         this.k5("Invalid property declaration.");
      } else {
         y4 var2 = null;
         boolean var3 = false;
         int var4 = 0;
         com.aspose.slides.internal.l6.n3 var5 = var1.n5(var4);
         if (var5.s7() != 59) {
            if (var5.s7() == 22) {
               if (!"important".equals(var5.n5(0).x8())) {
                  this.k5(d1.n5("Undefined rule !'{0}'", new Object[]{var5.n5(0).x8()}));
                  return;
               }

               var3 = true;
               var5 = var1.n5(++var4);
            }

            if (var5.s7() != 44) {
               this.k5(d1.n5("Unexpected token type '{0}'.", new Object[]{com.aspose.slides.internal.e2.k5.k5[var5.s7()]}));
            } else {
               String var6 = ((com.aspose.slides.internal.e2.n5)((com.aspose.slides.internal.l6.u3)var5).n3()).t2();
               var5 = var1.n5(++var4);
               if (var5.s7() == 21) {
                  try {
                     for (int var7 = 0; var7 < var5.n5(); var7++) {
                        com.aspose.slides.internal.l6.n3 var8 = var5.n5(var7);
                        var2 = this.n5(var8, var2);
                     }

                     if (var2 != null && var2.u3() != null) {
                        var2 = var2.l6();
                     }

                     this.l6.n5(var6, var2, var3);
                  } catch (m3 var9) {
                     throw var9;
                  } catch (u3 var10) {
                     this.n5(var10);
                  }
               } else {
                  this.k5(d1.n5("Unexpected token type '{0}'.", new Object[]{com.aspose.slides.internal.e2.k5.k5[var1.s7()]}));
               }
            }
         }
      }
   }

   private y4 n5(com.aspose.slides.internal.l6.n3 var1, y4 var2) {
      com.aspose.slides.internal.n5.y2 var3 = ((com.aspose.slides.internal.l6.u3)var1).n3();
      if (var3 == null) {
         throw com.aspose.slides.internal.z8.u9.n5(var1.s7(), var1.x8());
      }

      com.aspose.slides.internal.e2.n5 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.e2.n5.class);
      String var5;
      if (var4 != null) {
         var5 = var4.t2();
      } else {
         var5 = var3.l6();
      }

      y4 var6 = null;
      switch (var1.s7()) {
         case 44:
            if (var1.x8().length() == 7 && "inherit".equals(var5)) {
               var6 = com.aspose.slides.internal.z8.n5.n5(var2, (short)12, "inherit");
            } else {
               var6 = com.aspose.slides.internal.z8.n5.l6(var2, var5);
            }
            break;
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 52:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 62:
         case 63:
         case 66:
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
         case 77:
         case 78:
         default:
            if (var1.s7() == 0) {
               throw new m3(var1.x8());
            }

            throw com.aspose.slides.internal.z8.u9.n5(var1.s7(), var1.x8());
         case 51:
            var6 = com.aspose.slides.internal.z8.n5.n5(var2, (short)0, ",");
            break;
         case 53:
            var6 = com.aspose.slides.internal.z8.n5.n5(var2, var5);
            break;
         case 54:
            var6 = com.aspose.slides.internal.z8.n5.u3(var2, var1);
            break;
         case 61:
            var6 = com.aspose.slides.internal.z8.n5.n5(var2, (short)4, var5);
            break;
         case 64:
            var6 = com.aspose.slides.internal.z8.n5.n5(var2, (short)2, var5);
            break;
         case 65:
            var6 = this.l6(var1, var2);
            break;
         case 67:
         case 68:
         case 69:
            var6 = com.aspose.slides.internal.z8.n5.k5(var2, var1);
            break;
         case 70:
            var6 = com.aspose.slides.internal.z8.n5.l6(var2, var1);
            break;
         case 76:
            var6 = com.aspose.slides.internal.z8.n5.n5(var2, var1);
            break;
         case 79:
            var6 = com.aspose.slides.internal.z8.n5.n5(var2, (short)1, var5);
      }

      return var6;
   }

   private y4 l6(com.aspose.slides.internal.l6.n3 var1, y4 var2) {
      String var3 = var1.x8();
      y4 var4 = null;
      if (var1.n5() != 0) {
         com.aspose.slides.internal.l6.n3 var5 = var1.n5(0);
         if (var5.s7() != 21) {
            throw com.aspose.slides.internal.z8.u9.n5(var5.s7(), var5.x8());
         }

         int var6 = 0;
         y4 var7 = null;

         while (var6 < var5.n5()) {
            com.aspose.slides.internal.l6.n3 var8 = var5.n5(var6++);
            var7 = this.n5(var8, var7);
         }

         if (var7 != null) {
            var4 = var7.l6();
         }
      }

      switch (var3.charAt(0)) {
         case 'R':
         case 'r':
            switch (var3.charAt(1)) {
               case 'E':
               case 'e':
                  if (d1.u3(var3, "rect(", (short)3)) {
                     return com.aspose.slides.internal.z8.n5.n5(var2, (short)38, var4);
                  }
                  break;
               case 'G':
               case 'g':
                  if (d1.u3(var3, "rgb(", (short)3)) {
                     return com.aspose.slides.internal.z8.n5.n5(var2, (short)27, var4);
                  }
            }
         default:
            return com.aspose.slides.internal.z8.n5.n5(var2, var3, var4);
      }
   }

   private g7 n5(com.aspose.slides.internal.l6.n3 var1, int var2) {
      g7 var3 = this.n5(var1.n5(var2++), (g7)null);

      while (var2 < var1.n5()) {
         com.aspose.slides.internal.l6.n3 var4 = var1.n5(var2++);
         var3 = this.n5(var4, var3);
      }

      return var3;
   }

   private g7 t9(com.aspose.slides.internal.l6.n3 var1) {
      if (var1.s7() == 0) {
         throw new m1(var1.x8());
      }

      g7 var2 = this.n5(var1.n5(0), (g7)null);
      if (var1.n5() == 1) {
         return var2;
      }

      int var3 = 1;

      while (var3 < var1.n5()) {
         com.aspose.slides.internal.l6.n3 var4 = var1.n5(var3++);
         var2 = this.n5(var4, var2);
      }

      return var2;
   }

   private g7 n5(com.aspose.slides.internal.l6.n3 var1, g7 var2) {
      g7 var3;
      o0 var4;
      var3 = null;
      var4 = null;
      label124:
      switch (var1.s7()) {
         case 12:
            com.aspose.slides.internal.l6.n3 var5 = var1.n5(0);
            String var6 = null;
            if (var5.s7() == 31) {
               var6 = var5.n5() == 0 ? d1.n5 : com.aspose.slides.internal.e2.n5.k5(var5.n5(0));
               var5 = var1.n5(1);
            }

            if (var5.s7() == 80) {
               var3 = this.u3.n5(var6);
            } else {
               var3 = this.u3.n5(var6, com.aspose.slides.internal.e2.n5.k5(var5));
            }
            break;
         case 13:
            if (var1.n5() == 0) {
               int var7 = var1.a6() + 1;
               com.aspose.slides.internal.l6.n3 var8 = var1.u9();

               while (var7 < var8.n5()) {
                  com.aspose.slides.internal.l6.n3 var9 = var8.n5(var7);
                  var8.l6(var7);
                  var1.n5(var9);
               }
            }

            int var13 = 0;
            if (var1.n5(var13).s7() == 59) {
               var13++;
            }

            String var15 = var1.n5(var13).x8();
            var13++;
            int var16 = var1.t9() - var1.e2();
            if (var16 > 2 || var16 <= 0) {
               var16 = 1;
            }

            switch (var16) {
               case 1:
                  switch (t2.n5(d1.a6(var15))) {
                     case 0:
                        var4 = this.a6.l6();
                        break label124;
                     case 1:
                        var4 = this.a6.k5();
                        break label124;
                     case 2:
                        var4 = this.a6.u3();
                        break label124;
                     case 3:
                        var4 = this.a6.a6();
                        break label124;
                     case 4:
                        var4 = this.a6.u9();
                        break label124;
                     case 5:
                        var4 = this.a6.h0();
                        break label124;
                     case 6:
                        var4 = this.a6.c8();
                        break label124;
                     case 7:
                        var4 = this.a6.n5(t4(var1));
                        break label124;
                     case 8:
                        var4 = this.a6.l6(t4(var1));
                        break label124;
                     case 9:
                        var4 = this.a6.k5(t4(var1));
                        break label124;
                     case 10:
                        var4 = this.a6.u3(t4(var1));
                        break label124;
                     case 11:
                        List var10 = new List();
                        int var17 = 1;

                        while (var17 < var1.n5()) {
                           com.aspose.slides.internal.l6.n3 var12 = var1.n5(var17++);
                           if (var12.s7() != 51) {
                              var10.addItem(var12.x8());
                           }
                        }

                        var4 = this.a6.n5(var10);
                        break label124;
                     case 12:
                        g7 var11 = this.n5(var1, var13);
                        var4 = this.a6.n5(var11);
                        if (var11.k5() == 9) {
                           throw new m1(var4.a6());
                        }

                        if (var11.k5() == 0
                           && com.aspose.slides.internal.v6g.k5.l6(((com.aspose.slides.internal.x8.y2)var11).l6(), com.aspose.slides.internal.x8.m1.class)) {
                           throw new m1(var4.a6());
                        }
                        break label124;
                     case 13:
                        var4 = this.a6.t2();
                        break label124;
                     case 14:
                        var4 = this.a6.s7();
                        break label124;
                     case 15:
                        var4 = this.a6.x8();
                        break label124;
                     case 16:
                        var4 = this.a6.y4();
                        break label124;
                     case 17:
                        var4 = this.a6.e2();
                        break label124;
                     case 18:
                        var4 = this.a6.t9();
                        break label124;
                     case 19:
                        var4 = this.a6.z1();
                        break label124;
                     case 20:
                        var4 = this.a6.t4();
                        break label124;
                     case 21:
                        var4 = this.a6.q0();
                        break label124;
                     case 22:
                        var4 = this.a6.z3();
                        break label124;
                     case 23:
                        var4 = this.a6.m1();
                        break label124;
                     case 24:
                        var4 = this.a6.k7();
                        break label124;
                     case 25:
                        var4 = this.a6.n5(var1.n5(var13).x8());
                        break label124;
                     case 26:
                        var4 = this.a6.n3();
                        break label124;
                     case 27:
                        var3 = this.u3.k5();
                        break label124;
                     case 28:
                     case 29:
                     case 30:
                     case 31:
                        var3 = this.u3.l6(null, var15);
                        break label124;
                     default:
                        var3 = this.u3.l6(null, var15);
                        break label124;
                  }
               case 2:
                  switch (t2.n5(d1.a6(var15))) {
                     case 11:
                        throw new m1(var15);
                     case 12:
                     case 13:
                     case 14:
                     case 15:
                     case 16:
                     case 17:
                     case 18:
                     case 19:
                     case 20:
                     case 21:
                     case 22:
                     case 23:
                     case 24:
                     case 25:
                     case 26:
                     case 27:
                     default:
                        var3 = this.u3.l6(null, var15);
                        break label124;
                     case 28:
                     case 29:
                     case 30:
                     case 31:
                     case 32:
                     case 33:
                     case 34:
                     case 35:
                        var3 = this.u3.l6(null, var15);
                  }
               default:
                  break label124;
            }
         case 18:
            var4 = this.z1(var1);
            break;
         case 44:
            var3 = this.u3.n5(null, com.aspose.slides.internal.e2.n5.k5(var1));
            break;
         case 66:
            var4 = this.a6.n5(null, com.aspose.slides.internal.e2.n5.l6(var1));
            break;
         case 70:
            var4 = this.a6.l6(null, com.aspose.slides.internal.e2.n5.n5(var1));
      }

      if (var3 != null) {
         return var2 == null ? var3 : this.u3.l6(var2, var3);
      }

      if (var4 != null) {
         if (var2 == null) {
            var2 = this.u3.l6();
         }

         return this.u3.n5(var2, var4);
      } else {
         return var2;
      }
   }

   private o0 z1(com.aspose.slides.internal.l6.n3 var1) {
      String var2 = null;
      int var3 = 0;
      if (var1.n5(var3).s7() == 31) {
         var2 = var1.n5(var3).n5() == 0 ? d1.n5 : var1.n5(var3).n5(0).x8();
         var3++;
      }

      String var4 = var1.n5(var3).x8();
      if (var3 == var1.n5() - 1) {
         return this.a6.k5(var2, var4);
      }

      if (var3 != var1.n5() - 3) {
         throw new m3(var1.h0());
      }

      String var5 = com.aspose.slides.internal.z8.n5.n5(null, var1.n5(var3 + 2).x8()).t2();
      switch (var1.n5(var3 + 1).s7()) {
         case 72:
            return this.a6.l6(var2, var4, var5);
         case 73:
         case 74:
         case 75:
         case 76:
         case 77:
         case 79:
         case 80:
         case 82:
         case 83:
         case 84:
         default:
            throw com.aspose.slides.internal.z8.u9.l6(var1.n5(var3 + 1));
         case 78:
            return this.a6.n5(var2, var4, var5);
         case 81:
            return this.a6.k5(var2, var4, var5);
         case 85:
            return this.a6.u3(var2, var4, var5);
         case 86:
            return this.a6.u9(var2, var4, var5);
         case 87:
            return this.a6.a6(var2, var4, var5);
      }
   }

   private static com.aspose.slides.internal.j5.n5 t4(com.aspose.slides.internal.l6.n3 var0) {
      if (var0.n5() == 2) {
         return com.aspose.slides.internal.j5.n5.n5(var0.n5(1).x8());
      }

      int var1 = 1;
      a5 var2 = new a5();

      while (var1 < var0.n5()) {
         var2.n5(var0.n5(var1++));
      }

      return com.aspose.slides.internal.j5.n5.n5(var2.toString());
   }

   private boolean q0(com.aspose.slides.internal.l6.n3 var1) {
      if (var1.s7() == 90) {
         this.u3(var1.x8());
         return true;
      } else {
         return false;
      }
   }
}
