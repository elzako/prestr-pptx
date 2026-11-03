package com.aspose.slides.internal.z5z;

import com.aspose.slides.Collections.IDictionary;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.z0k.z1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p8;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.l0;
import java.io.File;

public class u3 implements a6 {
   private static a6 l6;
   protected final String[] n5 = new String[]{
      "/usr/share/fonts",
      z1.l6(System.getProperty("user.home"), ".fonts"),
      "/usr/local/share/fonts",
      "/usr/X11R6/lib/X11/fonts",
      "/usr/openwin/lib/X11/fonts",
      "/opt/kde3/share/fonts",
      "/usr/share/X11/fonts",
      "/run/current-system/sw/share/X11-fonts"
   };

   private u3() {
   }

   public static a6 n5() {
      if (l6 == null) {
         l6 = new u3();
      }

      return l6;
   }

   @Override
   public final String[] l6() {
      switch (x8.n5()) {
         case 0:
            return new String[]{this.u3()};
         case 1:
            return this.k5();
         case 2:
            return new String[]{
               z1.l6(System.getProperty("user.home"), "Library/Fonts/"),
               "/Library/Fonts/",
               "/Network/Library/Fonts/",
               "/System/Library/Fonts/",
               "/System Folder/Fonts/"
            };
         default:
            throw new InvalidOperationException("Unknown operating system.");
      }
   }

   private String[] k5() {
      String[] var1 = new String[]{
         "/etc/fonts/fonts.conf",
         z1.l6(System.getProperty("user.home"), ".fonts.conf"),
         z1.l6(System.getProperty("user.home"), ".config/fontconfig/fonts.conf")
      };
      List var2 = new List();

      for (String var6 : var1) {
         try {
            if (com.aspose.slides.internal.z0k.u9.k5(var6)) {
               var2.addRange(this.n5(var6));
            }
         } catch (Exception var9) {
            com.aspose.slides.internal.f8y.n5.k5(d1.n5("Error occurs on reading file: '{0}'.{1}",new Object[]{ var6, var9.getMessage()}));
         }
      }

      if (var2.isEmpty()) {
         for (String var13 : this.n5) {
            try {
               if (com.aspose.slides.internal.z0k.u3.k5(var13)) {
                  var2.addItem(var13);
               }
            } catch (Exception var8) {
               com.aspose.slides.internal.f8y.n5.k5(
                  d1.n5("Error occurs in FontsSubsystem.readFontConfigurationFiles.\r\nDirectory: {0}\r\nMessage: {1}",new Object[]{ var13, var8.getMessage()})
               );
            }
         }
      }

      return (String[])var2.toArray(new String[0]);
   }

   private String[] n5(String var1) {
      List var2 = new List();
      XmlDocument var3 = new XmlDocument();
      var3.load(var1);
      i0 var4 = var3.getElementsByTagName("dir");
      IEnumerator var5 = var4.iterator();

      try {
         while (var5.hasNext()) {
            l0 var6 = (l0)var5.next();
            String var7 = var6.getInnerText();
            if (d1.l6(var7, "~")) {
               var7 = z1.l6(System.getProperty("user.home"), d1.n5(var7, 0, 2));
            }

            var2.addItem(var7);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            ((IDisposable)var5).dispose();
         }
      }

      return (String[])var2.toArray(new String[0]);
   }

   @Override
   public final void n5(IDictionary var1) {
   }

   private String u3() {
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
