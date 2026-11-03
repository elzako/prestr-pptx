package com.aspose.slides.internal.m6;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.e7.x8;
import com.aspose.slides.internal.h7.m1;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.v2.c8;
import com.aspose.slides.internal.v2.s7;
import com.aspose.slides.internal.v2.t2;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.t9;

public class a6 implements IGenericEnumerator<Object> {
   private final byte[] n5 = new byte[10];
   private final u3 l6;
   private Object k5;

   @Override
   public final Object next() {
      return this.k5;
   }

   private void n5(Object var1) {
      this.k5 = var1;
   }

   public a6(u3 var1) {
      this.l6 = var1;
   }

   @Override
   public final void dispose() {
   }

   @Override
   public final boolean hasNext() {
      this.l6.n5().y4();
      if (this.l6.n5().l6()) {
         this.n5((Object)null);
         return false;
      }

      char var1 = this.l6.n5().h0();
      switch (var1) {
         case '(':
            this.n5(this.l6.n5().q0());
            break;
         case ')':
         case '*':
         case ',':
         case ':':
         case ';':
         case '=':
         case '>':
         case '?':
         case '@':
         case 'A':
         case 'C':
         case 'D':
         case 'E':
         case 'F':
         case 'G':
         case 'H':
         case 'J':
         case 'K':
         case 'L':
         case 'M':
         case 'N':
         case 'O':
         case 'P':
         case 'Q':
         case 'S':
         case 'T':
         case 'U':
         case 'V':
         case 'W':
         case 'X':
         case 'Y':
         case 'Z':
         case '\\':
         case '^':
         case '_':
         case '`':
         case 'a':
         case 'b':
         case 'c':
         case 'd':
         case 'e':
         case 'g':
         case 'h':
         case 'i':
         case 'j':
         case 'k':
         case 'l':
         case 'm':
         case 'o':
         case 'p':
         case 'q':
         case 'r':
         case 's':
         default:
            String var7 = this.k5();
            if (d1.l6(var7).length() > 0) {
               this.n5(m1.n5(var7));
            }
            break;
         case '+':
         case '-':
         case '.':
         case '0':
         case '1':
         case '2':
         case '3':
         case '4':
         case '5':
         case '6':
         case '7':
         case '8':
         case '9':
            this.n5(this.n5(var1));
            break;
         case '/':
            this.n5(this.l6.n5().t9());
            break;
         case '<':
            this.l6.n5().a6();
            var1 = this.l6.n5().h0();
            this.l6.n5().k5();
            if (var1 == '<') {
               this.n5((Object)this.a6());
            } else {
               this.n5(this.l6.n5().q0());
            }
            break;
         case 'B':
            this.n5(this.n5());
            break;
         case 'I':
            this.n5(this.l6());
            break;
         case 'R':
            String var6 = this.l6.n5().e2();
            if ("R".equals(var6)) {
               this.n5(new com.aspose.slides.internal.v2.u9(null));
            } else {
               this.n5(m1.n5(var6));
            }
            break;
         case '[':
            this.n5(this.t2());
            break;
         case ']':
            this.l6.n5().a6();
            this.n5(s7.c8());
            break;
         case 'f':
            String var5 = this.l6.n5().n5(5);
            if ("false".equals(var5)) {
               this.n5(com.aspose.slides.internal.v2.l6.l6());
            } else {
               this.n5(m1.n5(var5));
            }
            break;
         case 'n':
            String var4 = this.l6.n5().e2();
            if ("null".equals(var4)) {
               this.n5(s7.c8());
            } else {
               this.n5(m1.n5(var4));
            }
            break;
         case 't':
            String var2 = this.l6.n5().n5(4);
            if ("true".equals(var2)) {
               this.n5(com.aspose.slides.internal.v2.l6.n5());
            } else {
               this.n5(m1.n5(var2));
            }
      }

      return this.next() != null;
   }

   private Object n5(char var1) {
      a5 var2 = new a5();
      var2.n5(var1);
      this.l6.n5().a6();
      if (var1 == '-' && this.l6.n5().h0() == var1) {
         this.l6.n5().a6();
      }

      boolean var3 = var1 != '.';

      while (t9.u3(var1 = this.l6.n5().h0()) || var3 && var1 == '.' || var1 == '-') {
         if (var1 != '-') {
            var2.n5(var1);
         }

         this.l6.n5().a6();
         if (var3 && var1 == '.') {
            var3 = false;
         }
      }

      String var4 = var2.toString();
      return t2.l6(var4);
   }

   private Object n5() {
      String var1 = this.l6.n5().e2();
      m1 var2 = m1.n5(var1);
      if ("BI".equals(var1)) {
         com.aspose.slides.internal.v2.k5 var3 = new com.aspose.slides.internal.v2.k5();
         var2.n5(var3);

         while (this.hasNext() && com.aspose.slides.internal.v6g.k5.l6(this.next(), c8.class)) {
            c8 var4 = (c8)this.next();
            if (!this.hasNext()) {
               break;
            }

            var3.l6(var4, (s7)this.next());
         }

         m1 var5 = com.aspose.slides.internal.v6g.k5.n5(this.next(), m1.class);
         if (var5 != null) {
            var2.n5(var5.n5());
         }
      }

      return var2;
   }

   private Object l6() {
      String var1 = d1.n5(new Object[]{t9.q0((char)this.l6.n5().a6()), (char)this.l6.n5().a6()});
      if (!"ID".equals(var1)) {
         String var4 = d1.n5("Expected operator is 'ID', but actual='{0}' at stream position {1}", var1, this.l6.n5().n5());
         throw new IOException(var4);
      }

      char var2 = this.l6.n5().h0();
      if (x8.u3(var2)) {
         this.l6.n5().a6();
      }

      m1 var3 = m1.n5("ID");
      var3.n5(this.u3());
      return var3;
   }

   private String k5() {
      this.l6.n5().y4();
      a5 var1 = new a5(4);
      int var2 = this.l6.n5().u9();

      while (var2 != -1 && !x8.u3(var2) && !x8.a6(var2) && var2 != 91 && var2 != 60 && var2 != 40 && var2 != 47 && (var2 < 48 || var2 > 57)) {
         char var3 = (char)this.l6.n5().a6();
         var2 = this.l6.n5().u9();
         var1.n5(var3);
         if (var3 == 'd' && (var2 == 48 || var2 == 49)) {
            char var4 = (char)this.l6.n5().a6();
            var1.n5(var4);
            var2 = this.l6.n5().a6();
         }
      }

      return var1.toString();
   }

   private byte[] u3() {
      e2 var1 = new e2();
      int var2 = this.l6.n5().a6();
      int var3 = this.l6.n5().a6();

      for (int var4 = this.l6.n5().a6(); var2 >= 0 && !this.n5(var2, var3, var4); var4 = this.l6.n5().a6()) {
         var1.writeByte((byte)var2);
         var2 = var3;
         var3 = var4;
      }

      return var1.toArray();
   }

   private boolean n5(int var1, int var2, int var3) {
      if (!x8.u9(var1) || var2 != 69 || var3 != 73) {
         return false;
      }

      if (this.l6.n5().l6()) {
         return true;
      }

      char var4 = this.l6.n5().h0();
      return x8.u9(var4) && this.n5(this.l6.n5());
   }

   private boolean n5(x8 var1) {
      int var2 = var1.n5(this.n5);
      boolean var3 = true;
      int var4 = -1;
      int var5 = -1;
      if (var2 > 0) {
         for (int var6 = 0; var6 < var2; var6++) {
            byte var7 = this.n5[var6];
            if ((var7 & 255) != 0 && (var7 & 255) < 9 || (var7 & 255) > 10 && (var7 & 255) < 32 && (var7 & 255) != 13) {
               var3 = false;
               break;
            }

            if (var4 == -1 && (var7 & 255) != 0 && (var7 & 255) != 9 && (var7 & 255) != 32 && (var7 & 255) != 10 && (var7 & 255) != 13) {
               var4 = var6;
            } else if (var4 != -1 && var5 == -1 && ((var7 & 255) == 0 || (var7 & 255) == 9 || (var7 & 255) == 32 || (var7 & 255) == 10 || (var7 & 255) == 13)) {
               var5 = var6;
            }
         }

         if (var5 != -1 && var4 != -1) {
            char[] var8 = j5.e2().n5(this.n5);
            String var9 = d1.n5(var8, var4, var5 - var4);
            if (!"Q".equals(var9) && !"EMC".equals(var9) && !"S".equals(var9)) {
               var3 = false;
            }
         }

         if (var2 == 10) {
            if (var4 != -1 && var5 == -1) {
               var5 = 10;
            }

            if (var5 != -1 && var4 != -1 && var5 - var4 > 3) {
               var3 = false;
            }
         }

         var1.l6((long)var2);
      }

      return var3;
   }

   private com.aspose.slides.internal.v2.k5 a6() {
      char var1 = (char)this.l6.n5().a6();
      com.aspose.slides.internal.f8y.n5.n5(var1 == '<', "Dictionary should start from <<");
      var1 = (char)this.l6.n5().a6();
      com.aspose.slides.internal.f8y.n5.n5(var1 == '<', "Dictionary should start from <<");
      this.l6.n5().y4();
      com.aspose.slides.internal.v2.k5 var2 = new com.aspose.slides.internal.v2.k5();
      boolean var3 = false;

      while (!var3) {
         this.l6.n5().y4();
         var1 = this.l6.n5().h0();
         if (var1 == '>') {
            var3 = true;
         } else if (var1 == '/') {
            this.n5(var2);
         } else {
            boolean var4 = this.u9();
            if (var4) {
               return var2;
            }
         }
      }

      char var7 = (char)this.l6.n5().a6();
      com.aspose.slides.internal.f8y.n5.n5(var7 == '>');
      var7 = (char)this.l6.n5().a6();
      com.aspose.slides.internal.f8y.n5.n5(var7 == '>');
      return var2;
   }

   private boolean u9() {
      int var1;
      for (var1 = this.l6.n5().a6(); var1 != -1 && var1 != 47 && var1 != 62; var1 = this.l6.n5().a6()) {
         if (var1 == 101) {
            var1 = this.l6.n5().a6();
            if (var1 == 110) {
               var1 = this.l6.n5().a6();
               if (var1 == 100) {
                  var1 = this.l6.n5().a6();
                  boolean var2 = var1 == 115
                     && this.l6.n5().a6() == 116
                     && this.l6.n5().a6() == 114
                     && this.l6.n5().a6() == 101
                     && this.l6.n5().a6() == 97
                     && this.l6.n5().a6() == 109;
                  boolean var3 = !var2 && var1 == 111 && this.l6.n5().a6() == 98 && this.l6.n5().a6() == 106;
                  if (var2 || var3) {
                     return true;
                  }
               }
            }
         }
      }

      if (var1 == -1) {
         return true;
      }

      this.l6.n5().k5();
      return false;
   }

   private void n5(com.aspose.slides.internal.v2.k5 var1) {
      c8 var2 = this.l6.n5().t9();
      s7 var3 = this.h0();
      this.l6.n5().y4();
      char var4 = this.l6.n5().h0();
      if (var4 == 'd') {
         String var5 = this.l6.n5().e2();
         if (var5 != null && !"def".equals(var5)) {
            this.l6.n5().n5(this.l6.n5().n5() - var5.length());
         } else {
            this.l6.n5().y4();
         }
      }

      if (var3 != null) {
         var1.n5(var2, var3);
      }
   }

   private s7 h0() {
      s7 var1 = this.c8();
      this.l6.n5().y4();
      char var2 = this.l6.n5().h0();
      if (var2 >= '0' && var2 <= '9') {
         s7 var3 = this.c8();
         this.l6.n5().y4();
         char var4 = (char)this.l6.n5().a6();
         com.aspose.slides.internal.f8y.n5.n5(var4 == 'R');
         return this.n5(((t2)var1).k5(), ((t2)var3).k5());
      } else {
         return var1;
      }
   }

   private s7 c8() {
      s7 var1 = null;
      this.l6.n5().y4();
      char var2 = this.l6.n5().h0();
      if (var2 == -1) {
         return null;
      }

      switch (var2) {
         case '(':
            var1 = this.l6.n5().q0();
            break;
         case '/':
            var1 = this.l6.n5().t9();
            break;
         case '<':
            this.l6.n5().a6();
            var2 = this.l6.n5().h0();
            this.l6.n5().k5();
            if (var2 == '<') {
               var1 = this.a6();
               this.l6.n5().y4();
            } else {
               var1 = this.l6.n5().q0();
            }
            break;
         case 'R':
            this.l6.n5().a6();
            var1 = new com.aspose.slides.internal.v2.u9(null);
            break;
         case '[':
            var1 = this.t2();
            break;
         case 'f':
            String var9 = this.l6.n5().n5(5);
            if ("false".equals(var9)) {
               var1 = com.aspose.slides.internal.v2.l6.l6();
            }

            com.aspose.slides.internal.f8y.n5.n5("false".equals(var9));
            break;
         case 'n':
            String var8 = this.l6.n5().e2();
            com.aspose.slides.internal.f8y.n5.n5("null".equals(var8), "'nul' string is expected");
            var1 = s7.c8();
            break;
         case 't':
            String var3 = this.l6.n5().n5(4);
            if ("true".equals(var3)) {
               var1 = com.aspose.slides.internal.v2.l6.n5();
            }

            com.aspose.slides.internal.f8y.n5.n5("true".equals(var3));
            break;
         case '\uffff':
            return null;
         default:
            if (t9.u3(var2) || var2 == '-' || var2 == '+' || var2 == '.') {
               return this.s7();
            }

            long var4 = this.l6.n5().n5();
            String var6 = this.l6.n5().e2();
            com.aspose.slides.internal.f8y.n5.n5(!d1.n5(var6), "Unknown dir object ");
            if ("endobj".equals(var6) || "endstream".equals(var6)) {
               this.l6.n5().n5(var4);
            }
      }

      return var1;
   }

   private com.aspose.slides.internal.v2.n5 t2() {
      char var1 = (char)this.l6.n5().a6();
      String var2 = d1.n5("expected='[' actual='{0}'", new Object[]{var1});
      com.aspose.slides.internal.f8y.n5.n5(var1 == '[', var2);
      com.aspose.slides.internal.v2.n5 var3 = new com.aspose.slides.internal.v2.n5();
      this.l6.n5().y4();

      char var4;
      for (; (var4 = this.l6.n5().h0()) > 0 && var4 != ']'; this.l6.n5().y4()) {
         s7 var5 = this.c8();
         if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.v2.u9.class)) {
            s7 var6 = var3.l6(var3.n5() - 1);
            if (com.aspose.slides.internal.v6g.k5.l6(var6, t2.class)) {
               t2 var7 = com.aspose.slides.internal.v6g.k5.n5(var6, t2.class);
               var3.n5(var3.n5() - 1);
               s7 var8 = var3.l6(var3.n5() - 1);
               if (com.aspose.slides.internal.v6g.k5.l6(var8, t2.class)) {
                  t2 var9 = com.aspose.slides.internal.v6g.k5.n5(var8, t2.class);
                  var3.n5(var3.n5() - 1);
                  var5 = this.n5(var9.k5(), var7.k5());
               } else {
                  var5 = null;
               }
            } else {
               var5 = null;
            }
         }

         if (var5 != null) {
            var3.n5(var5);
         } else {
            String var10 = this.l6.n5().c8();
            if ("endobj".equals(var10) || "endstream".equals(var10)) {
               return var3;
            }
         }
      }

      this.l6.n5().a6();
      this.l6.n5().y4();
      return var3;
   }

   private com.aspose.slides.internal.v2.u9 n5(long var1, int var3) {
      com.aspose.slides.internal.v2.t9 var4 = new com.aspose.slides.internal.v2.t9(var1, var3);
      if (this.l6.l6().containsKey(var4)) {
         return this.l6.l6().get_Item(var4);
      }

      com.aspose.slides.internal.v2.u9 var5 = new com.aspose.slides.internal.v2.u9(var1, var3);
      this.l6.l6().addItem(var4, var5);
      return var5;
   }

   private t2 s7() {
      a5 var1 = new a5();

      char var2;
      for (var2 = (char)this.l6.n5().a6();
         t9.u3(var2) || var2 == '-' || var2 == '+' || var2 == '.' || var2 == 'E' || var2 == 'e';
         var2 = (char)this.l6.n5().a6()
      ) {
         var1.n5(var2);
      }

      if (var2 != -1) {
         this.l6.n5().k5();
      }

      return t2.l6(var1.toString());
   }

   @Override
   public final void reset() {
      throw new NotSupportedException();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
