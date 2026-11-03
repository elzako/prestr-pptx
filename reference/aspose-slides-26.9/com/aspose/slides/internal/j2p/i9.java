package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.c7;
import com.aspose.slides.ms.System.Xml.h5;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.o8;
import com.aspose.slides.ms.System.Xml.u8;
import com.aspose.slides.ms.System.Xml.w4;
import com.aspose.slides.ms.System.Xml.w5;

public class i9 {
   public static final long n5 = com.aspose.slides.internal.v6g.k5.u9(1.0E7, 14);
   private static final char[] l6 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

   private static boolean a6(m8 var0, String var1, String var2) {
      return n5(var0, var1, var2)
         ? true
         : com.aspose.slides.ms.System.d1.a6(var0.getPrefix(), var1) && com.aspose.slides.ms.System.d1.a6(var0.getNamespaceURI(), var2);
   }

   public static boolean n5(m8 var0, String var1, String var2) {
      if (var0 == null) {
         throw new ArgumentNullException("element");
      }

      String var3 = var1.length() > 0 ? com.aspose.slides.ms.System.d1.n5(new String[]{"xmlns:", var1}) : "xmlns";
      return var0.u3(var3) && com.aspose.slides.ms.System.d1.a6(var0.n5(var3), var2);
   }

   public static boolean l6(m8 var0, String var1, String var2) {
      if (var0 == null) {
         throw new ArgumentNullException("element");
      }

      for (l0 var3 = var0.getParentNode(); var3 != null; var3 = var3.getParentNode()) {
         m8 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, m8.class);
         if (var4 != null && a6(var4, var1, var2)) {
            return true;
         }
      }

      return false;
   }

   public static String k5(m8 var0, String var1, String var2) {
      String var3 = var0.u3(var1) ? var0.n5(var1) : null;
      if (var3 == null && var0.u9(var1, var2)) {
         var3 = var0.u3(var1, var2);
      }

      return var3;
   }

   public static boolean u3(m8 var0, String var1, String var2) {
      return var0.u3(var1) || var0.u9(var1, var2);
   }

   public static boolean n5(m8 var0, String var1) {
      return n5(var0, var1 == null ? null : new String[]{var1});
   }

   public static boolean n5(m8 var0, String[] var1) {
      IEnumerator var2 = var0.getAttributes().iterator();

      try {
         while (var2.hasNext()) {
            u8 var3 = (u8)var2.next();
            boolean var4 = "xmlns".equals(var3.getName())
               || com.aspose.slides.ms.System.d1.l6(var3.getName(), "xmlns:")
               || "xml:space".equals(var3.getName())
               || "xml:lang".equals(var3.getName())
               || "xml:base".equals(var3.getName());

            for (int var5 = 0; !var4 && var1 != null && var5 < var1.length; var5++) {
               var4 = com.aspose.slides.ms.System.d1.a6(var3.getName(), var1[var5]);
            }

            if (!var4) {
               return false;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            ((IDisposable)var2).dispose();
         }
      }

      return true;
   }

   public static boolean n5(l0 var0) {
      return var0.getNodeType() == 2
         && (
            com.aspose.slides.ms.System.d1.a6(var0.getPrefix(), "xmlns")
               || var0.getPrefix().length() == 0 && com.aspose.slides.ms.System.d1.a6(var0.getLocalName(), "xmlns")
         );
   }

   public static boolean l6(l0 var0) {
      return var0.getNodeType() == 2 && com.aspose.slides.ms.System.d1.a6(var0.getPrefix(), "xml");
   }

   public static boolean k5(l0 var0) {
      boolean var1 = var0.getNodeType() == 2 && var0.getPrefix().length() == 0 && com.aspose.slides.ms.System.d1.a6(var0.getLocalName(), "xmlns");
      boolean var2 = l6(var0);
      return var1 || var2;
   }

   public static boolean u3(l0 var0) {
      return k5(var0) && var0.getValue().length() == 0;
   }

   public static String n5(u8 var0) {
      com.aspose.slides.internal.f8y.n5.n5(n5((l0)var0) || l6((l0)var0));
      return var0.getPrefix().length() == 0 ? com.aspose.slides.ms.System.d1.n5 : var0.getLocalName();
   }

   public static boolean n5(u8 var0, String var1) {
      return com.aspose.slides.ms.System.d1.a6(n5(var0), var1);
   }

   public static boolean n5(u8 var0, u8 var1) {
      return var1 == null ? !u3(var0) : !com.aspose.slides.ms.System.d1.a6(var1.getValue(), var0.getValue());
   }

   public static boolean l6(u8 var0) {
      return false;
   }

   public static String n5(String var0) {
      return n5(var0, 0, var0.length());
   }

   public static String n5(String var0, int var1, int var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < var2; var4++) {
         if (com.aspose.slides.ms.System.t9.t9(var0.charAt(var1 + var4))) {
            var3++;
         }
      }

      char[] var5 = new char[var2 - var3];
      var3 = 0;

      for (int var7 = 0; var7 < var2; var7++) {
         if (!com.aspose.slides.ms.System.t9.t9(var0.charAt(var1 + var7))) {
            var5[var3++] = var0.charAt(var1 + var7);
         }
      }

      return com.aspose.slides.ms.System.d1.n5(var5);
   }

   public static void n5(com.aspose.slides.internal.l7h.a5 var0, char var1, String var2) {
      int var3 = 0;
      int var4 = var2.length();

      while (var3 < var0.l6()) {
         if (var0.l6(var3) == var1) {
            var0.l6(var3, 1);
            var0.n5(var3, var2);
            var3 += var4;
         } else {
            var3++;
         }
      }
   }

   public static c7 n5(com.aspose.slides.internal.z0k.t4 var0, o8 var1, String var2) {
      w4 var3 = n5(var1);
      return c7.n5(var0, var3, var2);
   }

   public static w4 n5(o8 var0) {
      w4 var1 = new w4();
      var1.n5(var0);
      var1.l6(n5);
      var1.n5(0L);
      return var1;
   }

   public static XmlDocument n5(XmlDocument var0, o8 var1, String var2) {
      if (var0 == null) {
         throw new ArgumentNullException("document");
      }

      h2 var3 = new h2();
      var3.setPreserveWhitespace(var0.getPreserveWhitespace());
      com.aspose.slides.internal.z0k.w1 var4 = new com.aspose.slides.internal.z0k.w1(var0.getOuterXml());

      try {
         w4 var5 = new w4();
         var5.n5(var1);
         var5.l6(n5);
         var5.n5(0L);
         c7 var6 = c7.n5(var4, var5, var2);
         var3.load(var6);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }

      return var3;
   }

   public static XmlDocument n5(m8 var0, o8 var1, String var2) {
      if (var0 == null) {
         throw new ArgumentNullException("elem");
      }

      h2 var3 = new h2();
      var3.setPreserveWhitespace(true);
      com.aspose.slides.internal.z0k.w1 var4 = new com.aspose.slides.internal.z0k.w1(var0.getOuterXml());

      try {
         w4 var5 = new w4();
         var5.n5(var1);
         var5.l6(n5);
         var5.n5(0L);
         c7 var6 = c7.n5(var4, var5, var2);
         var3.load(var6);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }

      return var3;
   }

   public static XmlDocument n5(XmlDocument var0) {
      i0 var1 = var0.selectNodes("//comment()");
      if (var1 != null) {
         IEnumerator var2 = var1.iterator();

         try {
            while (var2.hasNext()) {
               l0 var3 = (l0)var2.next();
               var3.getParentNode().removeChild(var3);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               ((IDisposable)var2).dispose();
            }
         }
      }

      return var0;
   }

   public static i0 n5(l0 var0, boolean var1) {
      x8 var2 = new x8();
      x8 var3 = new x8();
      x8 var4 = new x8();
      x8 var5 = new x8();
      int var6 = 0;
      var3.addItem(var0);

      do {
         l0 var7 = var3.n5(var6);
         i0 var8 = var7.getChildNodes();
         if (var8 != null) {
            IEnumerator var9 = var8.iterator();

            try {
               while (var9.hasNext()) {
                  l0 var10 = (l0)var9.next();
                  if (var1 || !com.aspose.slides.internal.v6g.k5.l6(var10, h5.class)) {
                     var3.addItem(var10);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                  ((IDisposable)var9).dispose();
               }
            }
         }

         w5 var49 = var7.getAttributes();
         if (var49 != null) {
            IEnumerator var52 = var7.getAttributes().iterator();

            try {
               while (var52.hasNext()) {
                  l0 var11 = (l0)var52.next();
                  if (!"xmlns".equals(var11.getLocalName()) && !"xmlns".equals(var11.getPrefix())) {
                     var4.addItem(var11);
                  } else {
                     var5.addItem(var11);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var52, IDisposable.class)) {
                  ((IDisposable)var52).dispose();
               }
            }
         }
      } while (++var6 < var3.n5());

      IEnumerator var46 = var3.iterator();

      try {
         while (var46.hasNext()) {
            l0 var47 = (l0)var46.next();
            var2.addItem(var47);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var46, IDisposable.class)) {
            ((IDisposable)var46).dispose();
         }
      }

      IEnumerator var48 = var4.iterator();

      try {
         while (var48.hasNext()) {
            l0 var50 = (l0)var48.next();
            var2.addItem(var50);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var48, IDisposable.class)) {
            ((IDisposable)var48).dispose();
         }
      }

      IEnumerator var51 = var5.iterator();

      try {
         while (var51.hasNext()) {
            l0 var53 = (l0)var51.next();
            var2.addItem(var53);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var51, IDisposable.class)) {
            ((IDisposable)var51).dispose();
         }
      }

      return var2;
   }

   public static boolean n5(l0 var0, i0 var1) {
      IEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            l0 var3 = (l0)var2.next();
            if (var3 == var0) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            ((IDisposable)var2).dispose();
         }
      }

      return false;
   }

   public static String n5(String var0, boolean[] var1) {
      String var2 = com.aspose.slides.ms.System.d1.k5(var0, 1);
      var1[0] = true;
      if (com.aspose.slides.ms.System.d1.n5(var2, "xpointer(id(", (short)4)) {
         int var3 = com.aspose.slides.ms.System.d1.u9(var2, "id(", (short)4);
         int var4 = com.aspose.slides.ms.System.d1.u9(var2, ")", (short)4);
         if (var4 < 0 || var4 < var3 + 3) {
            throw new CryptographicException("Malformed reference element.");
         }

         var2 = com.aspose.slides.ms.System.d1.l6(var2, var3 + 3, var4 - var3 - 3);
         var2 = com.aspose.slides.ms.System.d1.n5(var2, "'", "");
         var2 = com.aspose.slides.ms.System.d1.n5(var2, "\"", "");
         var1[0] = false;
      }

      return var2;
   }

   public static String l6(String var0) {
      String var1 = com.aspose.slides.ms.System.d1.k5(var0, 1);
      if (com.aspose.slides.ms.System.d1.n5(var1, "xpointer(id(", (short)4)) {
         int var2 = com.aspose.slides.ms.System.d1.u9(var1, "id(", (short)4);
         int var3 = com.aspose.slides.ms.System.d1.u9(var1, ")", (short)4);
         if (var3 < 0 || var3 < var2 + 3) {
            throw new CryptographicException("Malformed reference element.");
         }

         var1 = com.aspose.slides.ms.System.d1.l6(var1, var2 + 3, var3 - var2 - 3);
         var1 = com.aspose.slides.ms.System.d1.n5(var1, "'", "");
         var1 = com.aspose.slides.ms.System.d1.n5(var1, "\"", "");
      }

      return var1;
   }

   public static long n5(com.aspose.slides.internal.z0k.t4 var0, com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.z0k.e2 var2 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.z0k.e2.class);
      if (var2 != null && var2.getPosition() == 0L) {
         var2.writeTo(var1);
         return var2.getLength();
      }

      short var3 = 4096;
      byte[] var4 = new byte[4096];
      long var5 = 0L;

      int var7;
      while ((var7 = var0.read(var4, 0, 4096)) > 0) {
         var1.write(var4, 0, var7);
         var5 += var7;
      }

      return var5;
   }

   public static Hashtable k5(String var0) {
      Hashtable var1 = new Hashtable();
      if (var0 != null) {
         String[] var2 = com.aspose.slides.ms.System.d1.u9(var0, (char[])null);

         for (String var6 : var2) {
            if (com.aspose.slides.ms.System.d1.a6(var6, "#default")) {
               var1.addItem(com.aspose.slides.ms.System.d1.n5, true);
            } else if (var6.length() > 0) {
               var1.addItem(var6, true);
            }
         }
      }

      return var1;
   }

   public static String u3(String var0) {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5(var0);
      n5(var1, '\r', "&#xD;");
      return var1.toString();
   }

   public static String a6(String var0) {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5(var0);
      var1.n5("&", "&amp;");
      var1.n5("<", "&lt;");
      var1.n5(">", "&gt;");
      n5(var1, '\r', "&#xD;");
      return var1.toString();
   }

   public static String u9(String var0) {
      return a6(var0);
   }

   public static String h0(String var0) {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5(var0);
      var1.n5("&", "&amp;");
      var1.n5("<", "&lt;");
      var1.n5("\"", "&quot;");
      n5(var1, '\t', "&#x9;");
      n5(var1, '\n', "&#xA;");
      n5(var1, '\r', "&#xD;");
      return var1.toString();
   }

   public static XmlDocument n5(i0 var0) {
      IEnumerator var1 = var0.iterator();

      try {
         while (var1.hasNext()) {
            l0 var2 = (l0)var1.next();
            if (var2.getOwnerDocument() != null) {
               return var2.getOwnerDocument();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            ((IDisposable)var1).dispose();
         }
      }

      return null;
   }

   public static void n5(m8 var0, x8 var1) {
      if (var1 != null) {
         IEnumerator var2 = var1.iterator();

         try {
            while (var2.hasNext()) {
               l0 var3 = (l0)var2.next();
               String var4 = var3.getPrefix().length() > 0
                  ? com.aspose.slides.ms.System.d1.n5(new String[]{var3.getPrefix(), ":", var3.getLocalName()})
                  : var3.getLocalName();
               if (!var0.u3(var4) && (!com.aspose.slides.ms.System.d1.a6(var4, "xmlns") || var0.getPrefix().length() != 0)) {
                  u8 var5 = var0.getOwnerDocument().createAttribute(var4);
                  var5.setValue(var3.getValue());
                  var0.n5(var5);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               ((IDisposable)var2).dispose();
            }
         }
      }
   }

   public static void n5(m8 var0, Hashtable var1) {
      if (var1 != null) {
         IEnumerator var2 = var1.getKeys().iterator();

         try {
            while (var2.hasNext()) {
               String var3 = (String)var2.next();
               if (!var0.u3(var3)) {
                  u8 var4 = var0.getOwnerDocument().createAttribute(var3);
                  var4.setValue(com.aspose.slides.internal.v6g.k5.n5(var1.get_Item(var3), String.class));
                  var0.n5(var4);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               ((IDisposable)var2).dispose();
            }
         }
      }
   }

   public static x8 n5(m8 var0) {
      if (var0 == null) {
         return null;
      }

      x8 var1 = new x8();
      l0 var2 = var0;
      if (var2 == null) {
         return null;
      }

      boolean var3 = true;

      while (var2 != null) {
         m8 var4 = com.aspose.slides.internal.v6g.k5.n5(var2, m8.class);
         if (var4 == null) {
            var2 = var2.getParentNode();
         } else {
            if (!n5(var4, var4.getPrefix(), var4.getNamespaceURI()) && !l6(var4, var4.getPrefix(), var4.getNamespaceURI())) {
               String var5 = var4.getPrefix().length() > 0 ? com.aspose.slides.ms.System.d1.n5(new String[]{"xmlns:", var4.getPrefix()}) : "xmlns";
               u8 var6 = var0.getOwnerDocument().createAttribute(var5);
               var6.setValue(var4.getNamespaceURI());
               var1.addItem(var6);
            }

            if (var4.s7()) {
               w5 var13 = var4.getAttributes();
               IEnumerator var14 = var13.iterator();

               try {
                  while (var14.hasNext()) {
                     u8 var7 = (u8)var14.next();
                     if (var3 && "xmlns".equals(var7.getLocalName())) {
                        u8 var15 = var0.getOwnerDocument().createAttribute("xmlns");
                        var15.setValue(var7.getValue());
                        var1.addItem(var15);
                        var3 = false;
                     } else if ("xmlns".equals(var7.getPrefix()) || "xml".equals(var7.getPrefix())) {
                        var1.addItem(var7);
                     } else if (var7.getNamespaceURI().length() > 0
                        && !n5(var4, var7.getPrefix(), var7.getNamespaceURI())
                        && !l6(var4, var7.getPrefix(), var7.getNamespaceURI())) {
                        String var8 = var7.getPrefix().length() > 0 ? com.aspose.slides.ms.System.d1.n5(new String[]{"xmlns:", var7.getPrefix()}) : "xmlns";
                        u8 var9 = var0.getOwnerDocument().createAttribute(var8);
                        var9.setValue(var7.getNamespaceURI());
                        var1.addItem(var9);
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
                     ((IDisposable)var14).dispose();
                  }
               }
            }

            var2 = var2.getParentNode();
         }
      }

      return var1;
   }

   public static byte[] n5(int var0) {
      byte[] var1 = new byte[8];
      int var2 = 0;
      if (var0 == 0) {
         return new byte[1];
      }

      for (int var3 = var0; var3 > 0; var2++) {
         int var4 = var3 % 256;
         var1[var2] = (byte)var4;
         var3 = (var3 - var4) / 256;
      }

      byte[] var5 = new byte[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         var5[var6] = var1[var2 - var6 - 1];
      }

      return var5;
   }

   public static int n5(byte[] var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1 *= 256;
         var1 += var0[var2] & 255;
      }

      return var1;
   }

   public static f5 n5(String var0, String var1) {
      if (var0 == null || var0.length() == 0) {
         throw new ArgumentException("String cannot be empty or null.");
      } else if (var1 != null && var1.length() != 0) {
         f5 var2 = new f5();
         var2.n5(var0);
         var2.l6(var1);
         return var2;
      } else {
         throw new ArgumentException("String cannot be empty or null.");
      }
   }

   public static com.aspose.slides.internal.f3c.c8 n5(t1 var0, int var1) {
      com.aspose.slides.internal.f3c.c8 var2 = new com.aspose.slides.internal.f3c.c8();
      ArrayList var3 = var1 == 1 ? new ArrayList() : null;
      if (var0.n5() != null) {
         IEnumerator var4 = var0.n5().iterator();

         try {
            while (var4.hasNext()) {
               com.aspose.slides.internal.f3c.h0 var5 = (com.aspose.slides.internal.f3c.h0)var4.next();
               switch (var1) {
                  case 0:
                     var2.n5(var5);
                     break;
                  case 1:
                     var3.addItem(n5(var5.c8(), var5.m1()));
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               ((IDisposable)var4).dispose();
            }
         }
      }

      if (var0.u3() == null && var0.a6() == null && var0.k5() == null && var3 == null) {
         return var2;
      }

      com.aspose.slides.internal.f3c.j5[] var50 = new com.aspose.slides.internal.f3c.j5[2];
      String var51 = var1 == 0 ? "AddressBook" : "My";
      var50[0] = new com.aspose.slides.internal.f3c.j5(var51, 1);
      var50[1] = new com.aspose.slides.internal.f3c.j5(var51, 2);

      for (int var6 = 0; var6 < var50.length; var6++) {
         if (var50[var6] != null) {
            com.aspose.slides.internal.f3c.c8 var7 = null;

            try {
               var50[var6].n5(4);
               var7 = var50[var6].n5();
               var50[var6].k5();
               if (var0.u3() != null) {
                  IEnumerator var8 = var0.u3().iterator();

                  try {
                     while (var8.hasNext()) {
                        String var9 = (String)var8.next();
                        var7 = var7.n5(2, var9, false);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                        ((IDisposable)var8).dispose();
                     }
                  }
               }

               if (var0.a6() != null) {
                  IEnumerator var52 = var0.a6().iterator();

                  try {
                     while (var52.hasNext()) {
                        f5 var55 = (f5)var52.next();
                        var7 = var7.n5(4, var55.n5(), false);
                        var7 = var7.n5(5, var55.l6(), false);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var52, IDisposable.class)) {
                        ((IDisposable)var52).dispose();
                     }
                  }
               }

               if (var0.k5() != null) {
                  IEnumerator var53 = var0.k5().iterator();

                  try {
                     while (var53.hasNext()) {
                        byte[] var56 = (byte[])var53.next();
                        String var10 = l6(var56);
                        var7 = var7.n5(14, var10, false);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var53, IDisposable.class)) {
                        ((IDisposable)var53).dispose();
                     }
                  }
               }

               if (var3 != null) {
                  IEnumerator var54 = var3.iterator();

                  try {
                     while (var54.hasNext()) {
                        f5 var57 = (f5)var54.next();
                        var7 = var7.n5(4, var57.n5(), false);
                        var7 = var7.n5(5, var57.l6(), false);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var54, IDisposable.class)) {
                        ((IDisposable)var54).dispose();
                     }
                  }
               }
            } catch (CryptographicException var48) {
            }

            if (var7 != null) {
               var2.n5(var7);
            }
         }
      }

      return var2;
   }

   public static String l6(byte[] var0) {
      return n5(var0, 0L, var0.length & 4294967295L);
   }

   public static String n5(byte[] var0, long var1, long var3) {
      String var5 = null;
      if (var0 != null) {
         char[] var6 = new char[(int)(((var3 & 4294967295L) - (var1 & 4294967295L) & 4294967295L) * 2L & 4294967295L)];
         long var7 = var1;
         long var9 = 0L;

         while ((var7 & 4294967295L) < (var3 & 4294967295L)) {
            long var11 = (var0[(int)var7] & 255 & 240) >> 4 & 4294967295L;
            var6[(int)(var9++)] = l6[(int)var11];
            var11 = var0[(int)var7] & 0xFF & 15 & 4294967295L;
            var6[(int)(var9++)] = l6[(int)var11];
            var7++;
         }

         var5 = com.aspose.slides.ms.System.d1.n5(var6);
      }

      return var5;
   }

   public static com.aspose.slides.internal.o8m.a6 n5(com.aspose.slides.internal.f3c.h0 var0) {
      return var0.q0().k5();
   }
}
