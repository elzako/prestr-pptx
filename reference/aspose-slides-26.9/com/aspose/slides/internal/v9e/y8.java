package com.aspose.slides.internal.v9e;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.XPathException;
import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.ms.System.r8;
import com.aspose.slides.ms.System.Xml.f4;
import com.aspose.slides.ms.System.Xml.k6;
import com.aspose.slides.ms.System.Xml.o8;

public class y8 extends com.aspose.slides.internal.k4s.h0 {
   private p8 n5;
   private p3 l6;
   private static Hashtable k5 = h0();
   private static com.aspose.slides.internal.k4s.n5 u3 = new y8$t2();

   public y8(p8 var1, p3 var2) {
      super(false);
      this.n5 = var1;
      this.l6 = var2;
   }

   public y8() {
      super(false);
   }

   public final void n5(p8 var1, p3 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public String l6() {
      return com.aspose.slides.ms.System.d1.n5;
   }

   @Override
   public String n5(String var1) {
      return this.n5.l6(var1);
   }

   @Override
   public com.aspose.slides.internal.k4s.l6 l6(String var1, String var2) {
      String var3 = this.n5(var1);
      k6 var4 = new k6(var2, var3);
      d1 var5 = this.n5.l6().n5(var4);
      if (var5 == null) {
         throw XsltException.create("The variable or parameter '{0}' is either not defined or it is out of scope.", var4.toString());
      } else {
         return var5;
      }
   }

   public final Object n5(d1 var1) {
      Object var2 = this.l6.n5(var1);
      if (var2 == null && !var1.u9()) {
         d1 var3 = this.n5.l6().l6(var1.k5());
         if (var3 != null) {
            var2 = this.l6.n5(var3);
         }
      }

      if (var2 == null) {
         throw XsltException.create("The variable or parameter '{0}' is either not defined or it is out of scope.", var1.k5().toString());
      } else {
         return var2;
      }
   }

   @Override
   public boolean a6() {
      return this.l6.l6().n5();
   }

   @Override
   public boolean n5(com.aspose.slides.internal.x6s.a6 var1) {
      var1 = var1.n5();
      var1.q0();
      return this.l6.l6().n5(this.l6, var1);
   }

   private com.aspose.slides.internal.p4l.q0 n5(com.aspose.slides.internal.p4l.q0[] var1, boolean var2, boolean var3, String var4, int[] var5) {
      int var6 = var1.length;
      int var7 = 0;

      for (int var8 = 0; var8 < var6; var8++) {
         if (com.aspose.slides.ms.System.d1.a6(var4, var1[var8].s7(), (short)(var2 ? 5 : 4)) == 0 && (!var3 || var1[var8].n5().y4())) {
            var1[var7++] = var1[var8];
         }
      }

      var6 = var7;
      if (var6 == 0) {
         return null;
      }

      if (var5 == null) {
         return var1[0];
      }

      var7 = 0;

      for (int var18 = 0; var18 < var6; var18++) {
         if (var1[var18].a6().length == var5.length) {
            var1[var7++] = var1[var18];
         }
      }

      var6 = var7;
      if (var6 <= 1) {
         return var1[0];
      }

      var7 = 0;

      for (int var19 = 0; var19 < var6; var19++) {
         boolean var9 = true;
         com.aspose.slides.internal.p4l.z3[] var10 = var1[var19].a6();

         for (int var11 = 0; var11 < var10.length; var11++) {
            int var12 = var5[var11];
            if (var12 != 5) {
               int var13 = n5(var10[var11].n5());
               if (var13 != var12 && var13 != 5) {
                  var9 = false;
                  break;
               }
            }
         }

         if (var9) {
            var1[var7++] = var1[var19];
         }
      }

      return var1[0];
   }

   private com.aspose.slides.internal.k4s.n5 n5(String var1, String var2, int[] var3, Object[] var4) {
      y8$u3 var5 = null;
      var4[0] = this.l6.l6(var1);
      if (var4[0] != null) {
         com.aspose.slides.internal.p4l.q0 var7 = this.n5(com.aspose.slides.ms.System.j8.n5(var4[0]).n5(60), true, false, var2, var3);
         if (var7 != null) {
            var5 = new y8$u3(var4[0], var7, null);
         }

         return var5;
      } else {
         var4[0] = this.l6.n5(var1);
         if (var4[0] != null) {
            com.aspose.slides.internal.p4l.q0 var6 = this.n5(com.aspose.slides.ms.System.j8.n5(var4[0]).n5(60), false, true, var2, var3);
            if (var6 != null) {
               var5 = new y8$u3(var4[0], var6, null);
            }

            return var5;
         } else {
            return null;
         }
      }
   }

   @Override
   public com.aspose.slides.internal.k4s.n5 n5(String var1, String var2, int[] var3) {
      com.aspose.slides.internal.k4s.n5 var4 = null;
      if (var1.length() == 0) {
         var4 = com.aspose.slides.internal.v6g.k5.n5(k5.get_Item(var2), com.aspose.slides.internal.k4s.n5.class);
      } else {
         String var5 = this.n5(var1);
         if ("urn:schemas-microsoft-com:Xslt".equals(var5) && "node-set".equals(var2)) {
            var4 = u3;
         } else {
            Object var6 = null;
            Object[] var7 = new Object[]{var6};
            var4 = this.n5(var5, var2, var3, var7);
            var6 = var7[0];
            if (var6 == null) {
               throw XsltException.create("Cannot find the script or external object that implements prefix '{0}'.", var1);
            }
         }
      }

      if (var4 == null) {
         throw XsltException.create("'{0}()' is an unknown XSLT function.", var2);
      } else if (var3.length >= var4.n5() && var4.l6() >= var3.length) {
         return var4;
      } else {
         throw XsltException.create(
            "XSLT function '{0}()' has the wrong number of arguments.",
            var2,
            com.aspose.slides.ms.System.a3.n5(var3.length, com.aspose.slides.internal.x7n.l6.k5())
         );
      }
   }

   private r8 k5(String var1, String var2) {
      o8 var3 = this.l6.k5();
      r8 var4 = null;
      if (var2.length() != 0) {
         var4 = var3.n5(null, var2);
      }

      return var3.n5(var4, var1);
   }

   private com.aspose.slides.internal.x6s.h0 n5(Object var1, String var2) {
      com.aspose.slides.internal.x6s.h0 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.x6s.h0.class);
      if (var3 != null) {
         ArrayList var8 = new ArrayList();
         Hashtable var5 = new Hashtable();

         while (var3.l6()) {
            String var6 = var2;
            if (var6 == null) {
               var6 = var3.k5().t2();
            }

            r8 var7 = this.k5(var3.k5().c8(), var6);
            if (!var5.containsKey(var7)) {
               var5.addItem(var7, null);
               var8.addItem(this.l6.n5(var7));
            }
         }

         return new com.aspose.slides.internal.v7y.f5(var8);
      } else {
         String var4 = var2;
         if (var4 == null) {
            var4 = this.n5.u3().t2();
         }

         return new com.aspose.slides.internal.v7y.r8(this.l6.n5(this.k5(f4.l6(var1), var4)));
      }
   }

   private Hashtable n5(f2 var1, com.aspose.slides.internal.x6s.a6 var2) {
      Hashtable var3 = new Hashtable();
      String var4 = this.l6.l6(var1.l6());
      com.aspose.slides.internal.v7y.j9 var5 = this.l6.k5(var1.l6());
      com.aspose.slides.internal.v7y.j9 var6 = this.l6.k5(var1.k5());
      com.aspose.slides.internal.x6s.h0 var7 = var2.n5(9, false);

      while (var7.l6()) {
         com.aspose.slides.internal.x6s.a6 var8 = var7.k5();
         n5(var8, var5, var4, var6, var3);
         if (var8.e2()) {
            do {
               n5(var8, var5, var4, var6, var3);
            } while (var8.t9());

            var8.q0();
         }
      }

      return var3;
   }

   private static void n5(Hashtable var0, String var1, com.aspose.slides.internal.x6s.a6 var2, boolean var3) {
      ArrayList var4 = (ArrayList)var0.get_Item(var1);
      if (var4 == null) {
         var4 = new ArrayList();
         var0.addItem(var1, var4);
      } else if (var3 && var2.u3((com.aspose.slides.internal.x6s.a6)var4.get_Item(var4.size() - 1)) == 2) {
         return;
      }

      var4.addItem(var2.n5());
   }

   private static void n5(
      com.aspose.slides.internal.x6s.a6 var0, com.aspose.slides.internal.v7y.j9 var1, String var2, com.aspose.slides.internal.v7y.j9 var3, Hashtable var4
   ) {
      try {
         if (var1.n5(var0) == null) {
            return;
         }
      } catch (XPathException var8) {
         throw XsltException.create("'{0}' is an invalid XSLT pattern.", var2);
      }

      Object var5 = var3.n5(new com.aspose.slides.internal.v7y.r8(var0, true));
      com.aspose.slides.internal.x6s.h0 var6 = com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.x6s.h0.class);
      if (var6 != null) {
         for (boolean var7 = false; var6.l6(); var7 = true) {
            n5(var4, var6.k5().c8(), var0, var7);
         }
      } else {
         String var9 = f4.l6(var5);
         n5(var4, var9, var0, false);
      }
   }

   private com.aspose.slides.internal.x7i.l6 k5(String var1) {
      String var2 = com.aspose.slides.ms.System.d1.n5;
      String var3 = com.aspose.slides.ms.System.d1.n5;
      if (var1 != null) {
         String var4 = null;
         String[] var5 = new String[]{var4};
         String[] var6 = new String[]{var3};
         f0.n5(var1, var5, var6);
         var4 = var5[0];
         var3 = var6[0];
         var2 = this.n5(var4);
      }

      com.aspose.slides.internal.x7i.l6 var8 = this.l6.h0().k5(new k6(var3, var2));
      if (var8 == null) {
         if (var1 != null) {
            throw XsltException.create("Decimal format '{0}' is not defined.", var1);
         }

         var8 = new com.aspose.slides.internal.x7i.l6(new com.aspose.slides.internal.x7n.s7(), '#', '0', ';');
      }

      return var8;
   }

   private boolean u3(String var1) {
      Object var2 = null;
      String var3 = null;
      String[] var4 = new String[]{var3};
      String[] var5 = new String[]{(String)var2};
      f0.n5(var1, var4, var5);
      var3 = var4[0];
      String var7 = var5[0];
      String var6 = this.n5.n5(var3);
      return !"http://www.w3.org/1999/XSL/Transform".equals(var6)
         ? false
         : "apply-imports".equals(var7)
            || "apply-templates".equals(var7)
            || "attribute".equals(var7)
            || "call-template".equals(var7)
            || "choose".equals(var7)
            || "comment".equals(var7)
            || "copy".equals(var7)
            || "copy-of".equals(var7)
            || "element".equals(var7)
            || "fallback".equals(var7)
            || "for-each".equals(var7)
            || "if".equals(var7)
            || "message".equals(var7)
            || "number".equals(var7)
            || "processing-instruction".equals(var7)
            || "text".equals(var7)
            || "value-of".equals(var7)
            || "variable".equals(var7);
   }

   private boolean a6(String var1) {
      String var2 = null;
      String var3 = null;
      String[] var4 = new String[]{var3};
      String[] var5 = new String[]{var2};
      f0.n5(var1, var4, var5);
      var3 = var4[0];
      var2 = var5[0];
      String var6 = this.n5(var3);
      if ("urn:schemas-microsoft-com:Xslt".equals(var6)) {
         return "node-set".equals(var2);
      } else if (var6.length() != 0) {
         Object var7 = null;
         Object[] var8 = new Object[]{var7};
         boolean var9 = this.n5(var6, var2, null, var8) != null;
         var7 = var8[0];
         return var9;
      } else {
         return "last".equals(var2)
            || "position".equals(var2)
            || "name".equals(var2)
            || "namespace-uri".equals(var2)
            || "local-name".equals(var2)
            || "count".equals(var2)
            || "id".equals(var2)
            || "string".equals(var2)
            || "concat".equals(var2)
            || "starts-with".equals(var2)
            || "contains".equals(var2)
            || "substring-before".equals(var2)
            || "substring-after".equals(var2)
            || "substring".equals(var2)
            || "string-length".equals(var2)
            || "normalize-space".equals(var2)
            || "translate".equals(var2)
            || "boolean".equals(var2)
            || "not".equals(var2)
            || "true".equals(var2)
            || "false".equals(var2)
            || "lang".equals(var2)
            || "number".equals(var2)
            || "sum".equals(var2)
            || "floor".equals(var2)
            || "ceiling".equals(var2)
            || "round".equals(var2)
            || k5.get_Item(var2) != null && !"unparsed-entity-uri".equals(var2);
      }
   }

   private com.aspose.slides.internal.x6s.h0 u9() {
      com.aspose.slides.internal.x6s.a6 var1 = this.l6.n5();
      return var1 != null ? new com.aspose.slides.internal.v7y.r8(var1.n5()) : com.aspose.slides.internal.v7y.s4.n5;
   }

   private String u9(String var1) {
      String var2 = com.aspose.slides.ms.System.d1.n5;
      String var3 = null;
      Object var4 = null;
      String[] var5 = new String[]{var3};
      String[] var6 = new String[]{(String)var4};
      f0.n5(var1, var5, var6);
      var3 = var5[0];
      String var9 = var6[0];
      String var7 = this.n5(var3);
      if ("http://www.w3.org/1999/XSL/Transform".equals(var7)) {
         if ("version".equals(var9)) {
            var2 = "1";
         } else if ("vendor".equals(var9)) {
            var2 = "Microsoft";
         } else if ("vendor-url".equals(var9)) {
            var2 = "http://www.microsoft.com";
         }

         return var2;
      } else if (var7 == null && var3 != null) {
         throw XsltException.create("Prefix '{0}' is not defined.", var3);
      } else {
         return com.aspose.slides.ms.System.d1.n5;
      }
   }

   public static int n5(com.aspose.slides.ms.System.y8 var0) {
      switch (com.aspose.slides.ms.System.y8.u3(var0)) {
         case 1:
            if (!com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.x6s.a6.class).l6(var0)
               && !com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.x6s.n5.class).l6(var0)) {
               if (com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.x6s.h0.class).l6(var0)) {
                  return 3;
               }

               return 5;
            }

            return 1;
         case 3:
            return 2;
         case 16:
            return 6;
         case 18:
            return 1;
         default:
            return 0;
      }
   }

   private static Hashtable h0() {
      Hashtable var0 = new Hashtable(10);
      var0.set_Item("current", new y8$n5());
      var0.set_Item("unparsed-entity-uri", new y8$x8());
      var0.set_Item("generate-id", new y8$h0());
      var0.set_Item("system-property", new y8$s7());
      var0.set_Item("element-available", new y8$k5());
      var0.set_Item("function-available", new y8$u9());
      var0.set_Item("document", new y8$l6());
      var0.set_Item("key", new y8$c8());
      var0.set_Item("format-number", new y8$a6());
      return var0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.x6s.h0 n5(y8 var0) {
      return var0.u9();
   }

   // $VF: synthetic method
   static String n5(y8 var0, String var1) {
      return var0.u9(var1);
   }

   // $VF: synthetic method
   static boolean l6(y8 var0, String var1) {
      return var0.u3(var1);
   }

   // $VF: synthetic method
   static boolean k5(y8 var0, String var1) {
      return var0.a6(var1);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.x6s.h0 n5(y8 var0, Object var1, String var2) {
      return var0.n5(var1, var2);
   }

   // $VF: synthetic method
   static p3 l6(y8 var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static Hashtable n5(y8 var0, f2 var1, com.aspose.slides.internal.x6s.a6 var2) {
      return var0.n5(var1, var2);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.x7i.l6 u3(y8 var0, String var1) {
      return var0.k5(var1);
   }
}
