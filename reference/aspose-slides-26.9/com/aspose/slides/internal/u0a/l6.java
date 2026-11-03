package com.aspose.slides.internal.u0a;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.p8;

@j3
public final class l6 {
   private String n5;
   private String l6;
   private ArrayList k5;
   private ArrayList u3;
   private static final char[] a6 = new char[]{' ', '<', '>'};
   private static final char[] u9 = new char[]{'<', '>'};
   private static final char[] h0 = new char[]{' ', '<', '>'};
   private static final char[] c8 = new char[]{'"', '<', '>'};
   private static final char[] t2 = new char[]{'<', '>', '"', '\'', '&'};

   public l6(String var1) {
      this(var1, null);
   }

   public l6(String var1, String var2) {
      if (var1 == null) {
         throw new ArgumentNullException("tag");
      }

      if (!a6(var1)) {
         throw new ArgumentException("Invalid XML string: " + var1);
      }

      this.l6 = var1;
      this.n5(var2);
   }

   public ArrayList n5() {
      return this.u3;
   }

   public String l6() {
      return this.l6;
   }

   public void n5(String var1) {
      if (var1 != null && !u9(var1)) {
         throw new ArgumentException("Invalid XML string: " + var1);
      }

      this.n5 = s7(var1);
   }

   public void n5(String var1, String var2) {
      if (var1 == null) {
         throw new ArgumentNullException("name");
      }

      if (var2 == null) {
         throw new ArgumentNullException("value");
      }

      if (this.c8(var1) != null) {
         throw new ArgumentException(d1.n5(new String[]{"Duplicate attribute : ", var1}));
      }

      if (this.k5 == null) {
         this.k5 = new ArrayList();
      }

      this.k5.addItem(new l6$n5(var1, var2));
   }

   public void n5(l6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("child");
      }

      if (this.u3 == null) {
         this.u3 = new ArrayList();
      }

      this.u3.addItem(var1);
   }

   public static String l6(String var0) {
      if (var0 == null) {
         return null;
      }

      if (d1.n5(var0, t2) == -1) {
         return var0;
      }

      a5 var1 = new a5();
      int var2 = var0.length();

      for (int var3 = 0; var3 < var2; var3++) {
         char var4 = var0.charAt(var3);
         switch (var4) {
            case '"':
               var1.n5("&quot;");
               break;
            case '&':
               var1.n5("&amp;");
               break;
            case '\'':
               var1.n5("&apos;");
               break;
            case '<':
               var1.n5("&lt;");
               break;
            case '>':
               var1.n5("&gt;");
               break;
            default:
               var1.n5(var4);
         }
      }

      return var1.toString();
   }

   private static String s7(String var0) {
      if (var0 == null) {
         return null;
      }

      a5 var1 = new a5(var0);
      var1.n5("&lt;", "<");
      var1.n5("&gt;", ">");
      var1.n5("&amp;", "&");
      var1.n5("&quot;", "\"");
      var1.n5("&apos;", "'");
      return var1.toString();
   }

   public static boolean k5(String var0) {
      return var0 != null && d1.n5(var0, h0) == -1;
   }

   public static boolean u3(String var0) {
      return var0 != null && d1.n5(var0, c8) == -1;
   }

   public static boolean a6(String var0) {
      return var0 != null && d1.n5(var0, a6) == -1;
   }

   public static boolean u9(String var0) {
      return var0 != null && d1.n5(var0, u9) == -1;
   }

   public l6 h0(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("tag");
      }

      if (this.u3 == null) {
         return null;
      }

      for (int var2 = 0; var2 < this.u3.size(); var2++) {
         l6 var3 = (l6)this.u3.get_Item(var2);
         if (d1.a6(var3.l6, var1)) {
            return var3;
         }
      }

      return null;
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      a5[] var2 = new a5[]{var1};
      this.n5(var2, 0);
      var1 = var2[0];
      return var1.toString();
   }

   private void n5(a5[] var1, int var2) {
      var1[0].n5("<");
      var1[0].n5(this.l6);
      if (this.k5 != null) {
         var1[0].n5(" ");

         for (int var3 = 0; var3 < this.k5.size(); var3++) {
            l6$n5 var4 = (l6$n5)this.k5.get_Item(var3);
            var1[0].n5(var4.n5()).n5("=\"").n5(l6(var4.l6())).n5("\"");
            if (var3 != this.k5.size() - 1) {
               var1[0].n5(p8.n5);
            }
         }
      }

      if (this.n5 != null && !d1.a6(this.n5, d1.n5) || this.u3 != null && this.u3.size() != 0) {
         var1[0].n5(">").n5(l6(this.n5));
         if (this.u3 != null) {
            var1[0].n5(p8.n5);

            for (Object recoveredElement$var6$4901 : this.u3) {
               l6 var6 = (l6)recoveredElement$var6$4901;
               var6.n5(var1, var2 + 1);
            }
         }

         var1[0].n5("</").n5(this.l6).n5(">").n5(p8.n5);
      } else {
         var1[0].n5("/>").n5(p8.n5);
      }
   }

   l6$n5 c8(String var1) {
      if (this.k5 != null) {
         for (Object recoveredElement$var3$5181 : this.k5) {
            l6$n5 var3 = (l6$n5)recoveredElement$var3$5181;
            if (d1.a6(var3.n5(), var1)) {
               return var3;
            }
         }
      }

      return null;
   }

   // $VF: synthetic method
   static String t2(String var0) {
      return s7(var0);
   }
}
