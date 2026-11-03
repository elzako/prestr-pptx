package com.aspose.slides.internal.e7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.z3;

public class x8 implements IDisposable {
   private final t4 n5;
   private static final byte[] l6 = new byte[2048];
   private static final byte[] k5 = new byte[]{101, 110, 100, 115, 116, 114, 101, 97, 109};
   private static final byte[] u3 = new byte[]{101, 110, 100, 111, 98, 106};

   public final long n5() {
      return this.n5.getPosition();
   }

   public final boolean l6() {
      int var1 = this.u9();
      return var1 < 0;
   }

   public x8(t4 var1) {
      this.n5 = var1;
      this.n5.seek(0L, 0);
   }

   public final void n5(long var1) {
      this.n5.setPosition(var1);
   }

   public final void k5() {
      this.n5(this.n5() - 1L);
   }

   public final void l6(long var1) {
      this.n5(this.n5() - var1);
   }

   public final String u3() {
      if (this.l6()) {
         return null;
      }

      a5 var1 = new a5();

      int var2;
      while ((var2 = this.a6()) != -1) {
         boolean var3 = l6(var2);
         if (var3) {
            break;
         }

         var1.n5((char)var2);
      }

      return var1.toString();
   }

   public final int a6() {
      return this.n5.readByte();
   }

   public final int u9() {
      long var1 = this.n5.getPosition();
      int var3 = this.n5.readByte();
      this.n5.setPosition(var1);
      return var3;
   }

   public final char h0() {
      long var1 = this.n5.getPosition();
      char var3 = (char)this.n5.readByte();
      this.n5.setPosition(var1);
      return var3;
   }

   public final String c8() {
      long var1 = this.n5();
      String var3 = this.e2();
      this.n5(var1);
      return var3;
   }

   public final int n5(byte[] var1) {
      return this.n5.read(var1, 0, var1.length);
   }

   public final int n5(byte[] var1, int var2, int var3) {
      return this.n5.read(var1, var2, var3);
   }

   public final long t2() {
      return this.x8();
   }

   public final int s7() {
      return this.n3();
   }

   public final long x8() {
      this.y4();
      String var1 = this.z1();

      try {
         return z3.a6(var1);
      } catch (RuntimeException var3) {
         return 0L;
      }
   }

   public final int n3() {
      this.y4();
      String var1 = this.z1();

      try {
         return z3.u3(var1);
      } catch (RuntimeException var3) {
         return 0;
      }
   }

   public final void y4() {
      int var1 = this.a6();

      while (u3(var1) || var1 == 37) {
         if (var1 == 37) {
            var1 = this.a6();

            while (!l6(var1) && var1 != -1) {
               var1 = this.a6();
            }
         } else {
            var1 = this.a6();
         }
      }

      if (var1 != -1) {
         this.k5();
      }
   }

   public final String e2() {
      this.y4();
      a5 var1 = new a5();

      for (char var2 = this.h0(); !n5(var2) && !a6(var2) && var2 != -1; var2 = this.h0()) {
         var1.n5(var2);
         this.a6();
      }

      return var1.toString();
   }

   public final String n5(int var1) {
      this.y4();
      char var2 = this.h0();

      a5 var3;
      for (var3 = new a5(var1);
         !u3(var2) && !a6(var2) && var2 != -1 && var3.l6() < var1 && var2 != '[' && var2 != '<' && var2 != '(' && var2 != '/';
         var2 = this.h0()
      ) {
         var3.n5((char)var2);
         this.a6();
      }

      return var3.toString();
   }

   public final com.aspose.slides.internal.v2.c8 t9() {
      int var1 = this.a6();
      com.aspose.slides.internal.f8y.n5.n5(var1 == 47, "CosName should start from /");
      a5 var2 = new a5();
      var1 = this.a6();

      while (var1 != -1) {
         char var3 = (char)var1;
         if (var3 == '#') {
            char var4 = (char)this.a6();
            char var5 = (char)this.a6();
            if (k5(var4) && k5(var5)) {
               String var6 = d1.n5("{0}{1}",new Object[]{ var4, var5});
               char var7 = (char)z3.l6(var6, 16);
               var2.n5(var7);
               var1 = this.a6();
            } else {
               this.k5();
               var1 = var4;
               var2.n5(var3);
            }
         } else {
            if (n5(var3)) {
               break;
            }

            var2.n5(var3);
            var1 = this.a6();
         }
      }

      if (var1 != -1) {
         this.k5();
      }

      return com.aspose.slides.internal.v2.c8.n5(var2.toString());
   }

   public final String z1() {
      int var1 = 0;
      a5 var2 = new a5();

      while ((var1 = this.a6()) != 32 && var1 != 10 && var1 != 13 && var1 != 60 && var1 != 91 && var1 != 40 && var1 != 0 && var1 != -1) {
         var2.n5((char)var1);
      }

      if (var1 != -1) {
         this.k5();
      }

      return var2.toString();
   }

   public static boolean l6(int var0) {
      return var0 == 10 || var0 == 13;
   }

   public static boolean k5(int var0) {
      return var0 >= 48 && var0 <= 57 || var0 >= 97 && var0 <= 102 || var0 >= 65 && var0 <= 70;
   }

   public static boolean u3(int var0) {
      return var0 == 0 || var0 == 9 || var0 == 12 || var0 == 10 || var0 == 13 || var0 == 32;
   }

   public static boolean a6(int var0) {
      return var0 == 93;
   }

   public static boolean n5(char var0) {
      return var0 == ' '
         || var0 == '\r'
         || var0 == '\n'
         || var0 == '\t'
         || var0 == '>'
         || var0 == '<'
         || var0 == '['
         || var0 == '/'
         || var0 == ']'
         || var0 == ')'
         || var0 == '('
         || var0 == 0
         || var0 == '\f'
         || var0 == -1;
   }

   public static boolean u9(int var0) {
      return var0 == 10 || var0 == 13 || var0 == 32;
   }

   public final List<Byte> t4() {
      List var1 = new List();
      int var2 = 0;
      byte[] var3 = k5;
      byte var4 = 5;

      int var5;
      while ((var5 = this.n5(l6, var2, 2048 - var2)) > 0) {
         var5 += var2;
         int var6 = var2;
         int var7 = var5 - 5;

         while (var6 < var5) {
            label62: {
               int var8 = var6 + 5;
               if (var2 == 0 && var8 < var7) {
                  byte var9 = l6[var8];
                  if ((var9 & 255) > 116 || (var9 & 255) < 97) {
                     var6 = var8;
                     break label62;
                  }
               }

               byte var12 = l6[var6];
               if (var12 == var3[var2]) {
                  if (++var2 == var3.length) {
                     var6++;
                     break;
                  }
               } else if (var2 == 3 && var12 == u3[var2]) {
                  var3 = u3;
                  var2++;
               } else {
                  var2 = var12 == 101 ? 1 : (var12 == 110 && var2 == 7 ? 2 : 0);
                  var3 = k5;
               }
            }

            var6++;
         }

         var7 = q1.n5(0, var6 - var2);
         if (var7 > 0) {
            byte[] var13 = new byte[var7];
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(l6)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var13)), 0, var7);
            var1.addRange(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(var13))));
         }

         if (var2 == var3.length) {
            this.n5(this.n5() - (var5 - var7));
            break;
         }

         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0, com.aspose.slides.ms.System.u3.n5((Object)(l6)), 0, var2);
      }

      return var1;
   }

   public final com.aspose.slides.internal.v2.y4 q0() {
      char var1 = (char)this.a6();
      if (var1 == '<') {
         return this.z3();
      }

      String var2 = d1.n5("parseCOSString string should start with '(' or '<' and not '{0}'", new Object[]{var1});
      com.aspose.slides.internal.f8y.n5.n5(var1 == '(', var2);
      a5 var3 = new a5();
      int var4 = 1;
      int var5 = this.a6();

      while (var4 > 0 && var5 != -1) {
         char var6 = (char)var5;
         int var7 = -2;
         if (var6 == ')') {
            var4 = this.h0(--var4);
            if (var4 != 0) {
               var3.n5(var6);
            }
         } else if (var6 == '(') {
            var4++;
            var3.n5(var6);
         } else if (var6 == '\\') {
            char var8 = (char)this.a6();
            switch (var8) {
               case '\n':
               case '\r':
                  var5 = this.a6();

                  while (l6(var5) && var5 != -1) {
                     var5 = this.a6();
                  }

                  var7 = var5;
                  break;
               case '(':
               case '\\':
                  var3.n5(var8);
                  break;
               case ')':
                  var4 = this.h0(var4);
                  if (var4 != 0) {
                     var3.n5(var8);
                  } else {
                     var3.n5('\\');
                  }
                  break;
               case '0':
               case '1':
               case '2':
               case '3':
               case '4':
               case '5':
               case '6':
               case '7':
                  a5 var9 = new a5();
                  var9.n5(var8);
                  var5 = this.a6();
                  char var10 = (char)var5;
                  if (var10 >= '0' && var10 <= '7') {
                     var9.n5(var10);
                     var5 = this.a6();
                     var10 = (char)var5;
                     if (var10 >= '0' && var10 <= '7') {
                        var9.n5(var10);
                     } else {
                        var7 = var5;
                     }
                  } else {
                     var7 = var5;
                  }

                  int var11 = z3.l6(var9.toString(), 8);
                  var3.n5((char)var11);
                  break;
               case 'b':
                  var3.n5('\b');
                  break;
               case 'f':
                  var3.n5('\f');
                  break;
               case 'n':
                  var3.n5('\n');
                  break;
               case 'r':
                  var3.n5('\r');
                  break;
               case 't':
                  var3.n5('\t');
                  break;
               default:
                  var3.n5(var8);
            }
         } else {
            var3.n5(var6);
         }

         if (var7 != -2) {
            var5 = var7;
         } else {
            var5 = this.a6();
         }
      }

      if (var5 != -1) {
         this.k5();
      }

      return new com.aspose.slides.internal.v2.y4(var3.toString());
   }

   private com.aspose.slides.internal.v2.y4 z3() {
      a5 var1 = new a5();

      while (true) {
         char var2 = (char)this.a6();
         boolean var3 = k5(var2);
         if (!var3) {
            if (var2 == '>') {
               break;
            }

            if (var2 < 0) {
               String var6 = "Missing closing bracket for hex string. Reached EOS";
               throw new IOException(var6);
            }

            if (var2 != ' ' && var2 != '\n' && var2 != '\t' && var2 != '\r' && var2 != '\b' && var2 != '\f') {
               if (var1.l6() % 2 != 0) {
                  var1.l6(var1.l6() - 1, 1);
               }

               do {
                  var2 = (char)this.a6();
               } while (var2 != '>' && var2 >= 0);

               if (var2 < 0) {
                  String var4 = "Missing closing bracket for hex string. Reached EOS";
                  throw new IOException(var4);
               }
               break;
            }
         } else {
            var1.n5(var2);
         }
      }

      return com.aspose.slides.internal.v2.y4.n5(var1.toString());
   }

   private int h0(int var1) {
      int var2 = var1;
      long var3 = this.n5();
      byte[] var5 = new byte[3];
      int var6 = this.n5(var5);
      if (var6 == 3 && ((var5[0] & 255) == 13 && (var5[1] & 255) == 10 && (var5[2] & 255) == 47 || (var5[0] & 255) == 13 && (var5[1] & 255) == 47)) {
         var2 = 0;
      }

      if (var6 > 0) {
         this.n5(var3);
      }

      return var2;
   }

   @Override
   public final void dispose() {
      if (this.n5 != null) {
         this.n5.dispose();
      }
   }
}
