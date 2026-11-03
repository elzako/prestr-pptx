package com.aspose.slides.internal.z0k;

import com.aspose.slides.ms.System.d1;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

class u3$n5 implements FilenameFilter {
   private Pattern n5;
   private boolean l6;

   public u3$n5(String var1, boolean var2) {
      if (var1 == "*.*") {
         this.n5 = Pattern.compile("^.*$");
      } else {
         var1 = var1.replace(".", "\\.");
         this.n5 = Pattern.compile("^" + var1.replace("*", ".*").replace("?", ".") + "$", 2);
      }

      this.l6 = var2;
   }

   @Override
   public boolean accept(File dir, String name) {
      String var3 = z1.l6(dir.getAbsolutePath(), name);
      File var4 = new File(var3);
      if (this.l6 && var4.isFile() || !this.l6 && var4.isDirectory()) {
         if (var4.isFile() && !d1.t2(name, ".")) {
            String var5 = this.n5.pattern();
            if (var5.endsWith("\\..*$")) {
               var5 = d1.n5(var5, "\\..*$", ".*$");
            }

            if (var5.endsWith("\\.$")) {
               var5 = d1.n5(var5, "\\.$", "$");
            }

            Pattern var6 = Pattern.compile(var5);
            return var6.matcher(name).find();
         } else {
            return this.n5.matcher(var4.getName()).find();
         }
      } else {
         return false;
      }
   }
}
