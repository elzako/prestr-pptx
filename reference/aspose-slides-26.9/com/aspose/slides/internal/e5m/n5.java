package com.aspose.slides.internal.e5m;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.e1x.y4;
import com.aspose.slides.internal.n2d.e2;
import com.aspose.slides.internal.n2d.t4;
import com.aspose.slides.internal.n2d.z3;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.internal.z0k.u9;
import com.aspose.slides.internal.z0k.z1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p8;
import com.aspose.slides.ms.System.u3;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.l0;
import java.io.File;

public class n5 implements e2 {
   private static e2 k5;
   protected static final String[] n5 = new String[]{
      "/system/fonts",
      "/usr/share/fonts",
      z1.l6(p8.n5(5), ".fonts"),
      "/usr/local/share/fonts",
      "/usr/X11R6/lib/X11/fonts",
      "/usr/openwin/lib/X11/fonts",
      "/opt/kde3/share/fonts",
      "/usr/share/X11/fonts",
      "/run/current-system/sw/share/X11-fonts"
   };
   protected static final String[] l6 = new String[]{
      z1.l6(p8.n5(5), "Library/Fonts/"), "/Library/Fonts/", "/Network/Library/Fonts/", "/System/Library/Fonts/", "/System Folder/Fonts/"
   };

   private n5() {
   }

   public static e2 l6() {
      if (k5 == null) {
         k5 = new n5();
      }

      return k5;
   }

   @Override
   public final String[] n5() {
      switch (z3.n5()) {
         case 0:
            return new String[]{this.a6()};
         case 1:
            return this.k5();
         case 2:
            return l6;
         default:
            throw new InvalidOperationException("Unknown operating system.");
      }
   }

   private String[] k5() {
      String[] var1 = new String[]{
         "/opt/etc/fonts/fonts.conf", "/etc/fonts/fonts.conf", z1.l6(p8.n5(5), ".fonts.conf"), z1.l6(p8.n5(5), ".config/fontconfig/fonts.conf")
      };
      List var2 = new List();

      for (String var6 : var1) {
         try {
            if (u9.k5(var6)) {
               var2.addRange(u3.n5(this.n5(var6)));
            }
         } catch (RuntimeException var14) {
            com.aspose.slides.internal.f8y.n5.u3(d1.n5("Error occurs on reading file: '{0}'.{1}",new Object[]{ var6, var14.getMessage()}));
         }

         if (var2.size() == 0) {
            for (String var10 : n5) {
               try {
                  if (com.aspose.slides.internal.z0k.u3.k5(var10)) {
                     var2.addItem(var10);
                  }
               } catch (RuntimeException var13) {
                  com.aspose.slides.internal.f8y.n5.u3(
                     d1.n5("Error occurs in FontsSubsystem.readFontConfigurationFiles.\r\nDirectory: {0}\r\nMessage: {1}",new Object[]{ var10, var13.getMessage()})
                  );
               }
            }
         }

         if (var2.size() == 0) {
            for (String var18 : l6) {
               try {
                  if (com.aspose.slides.internal.z0k.u3.k5(var18)) {
                     var2.addItem(var18);
                  }
               } catch (RuntimeException var12) {
                  com.aspose.slides.internal.f8y.n5.u3(
                     d1.n5("Error occurs in FontsSubsystem.readFontConfigurationFiles.\r\nDirectory: {0}\r\nMessage: {1}",new Object[]{ var18, var12.getMessage()})
                  );
               }
            }
         }
      }

      return (String[])var2.toArray(new String[0]);
   }

   private String[] n5(String var1) {
      List var2 = new List();
      XmlDocument var3 = new XmlDocument();
      var3.setXmlResolver(null);
      var3.load(var1);
      i0 var4 = var3.getElementsByTagName("dir");
      IEnumerator var5 = var4.iterator();

      try {
         while (var5.hasNext()) {
            l0 var6 = (l0)var5.next();
            String var7 = var6.getInnerText();
            if (var7 != null) {
               var7 = d1.l6(var7);
            }

            if (!d1.n5(var7)) {
               String var8 = null;
               if (var6.getAttributes() != null && var6.getAttributes().n5("prefix") != null) {
                  var8 = var6.getAttributes().n5("prefix").getValue();
               }

               var2.addItem(n5(var7, var8, var1));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            ((IDisposable)var5).dispose();
         }
      }

      return (String[])var2.toArray(new String[0]);
   }

   private static String n5(String var0, String var1, String var2) {
      if (d1.l6(var0, "~")) {
         String var3 = p8.n5(5);
         String var4 = var0.length() > 1 ? d1.k5(var0, 2) : d1.n5;
         var0 = z1.l6(var3, var4);
      }

      if (z1.h0(var0)) {
         return var0;
      }

      if (d1.u3(var1, "xdg", (short)5)) {
         return z1.l6(u3(), var0);
      }

      if (d1.u3(var1, "relative", (short)5)) {
         String var5 = z1.u9(var2);
         if (d1.n5(var5)) {
            var5 = com.aspose.slides.internal.z0k.u3.n5();
         }

         return z1.l6(var5, var0);
      } else {
         return !d1.u3(var1, "cwd", (short)5) && !d1.u3(var1, "default", (short)5) && !d1.n5(var1) ? var0 : z1.l6(com.aspose.slides.internal.z0k.u3.n5(), var0);
      }
   }

   private static String u3() {
      String var0 = p8.n5("XDG_DATA_HOME");
      return !d1.n5(var0) ? var0 : z1.l6(z1.l6(p8.n5(5), ".local"), "share");
   }

   @Override
   public final boolean n5(Object var1) {
      com.aspose.slides.internal.p1s.l6 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.p1s.l6.class);
      if (var2 != null && com.aspose.slides.internal.v6g.k5.l6(var2.n5().y1(), y4.class)) {
         String var3 = ((y4)var2.n5().y1()).n5();
         String var4 = t4.l6(var3) ? z1.u9(var3) : null;
         if (t4.l6(var4)) {
            String var5 = l6(var4);

            for (String var9 : this.n5()) {
               if (t4.l6(var9)) {
                  String var10 = l6(var9);
                  if (d1.n5(var5, var10, (short)5)) {
                     return true;
                  }
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static String l6(String var0) {
      if (d1.n5(var0)) {
         return d1.n5;
      }

      try {
         var0 = z1.k5(var0);
      } catch (RuntimeException var2) {
         com.aspose.slides.internal.f8y.n5.u3(d1.n5("NormalizeDirectoryPath: cannot normalize path '{0}'. {1}",new Object[]{ var0, var2.getMessage()}));
      }

      char var1 = z1.k5;
      if (var0.charAt(var0.length() - 1) != var1) {
         var0 = d1.l6(var0, var1);
      }

      return var0;
   }

   @Override
   public final void n5(IGenericDictionary<String, String> var1) {
   }

   private String a6() {
      try {
         return z1.l6(p8.n5("WINDIR"), "Fonts");
      } catch (Exception var4) {
         try {
            String var2 = "C:\\Windows\\Fonts";
            return new File(var2).exists() ? var2 : d1.n5;
         } catch (Exception var3) {
            return d1.n5;
         }
      }
   }
}
