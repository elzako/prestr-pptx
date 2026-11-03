package com.aspose.slides.internal.t9p;

import java.io.PrintStream;

public final class l6 {
   public static final PrintStream n5 = new PrintStream(new l6$n5(new l6$l6(null)), true);
   public static final PrintStream l6 = new PrintStream(new l6$n5(new l6$l6(null)), true);

   static {
      if (com.aspose.slides.internal.c9q.n5.n5()) {
         try {
            Runtime.getRuntime().addShutdownHook(new Thread(new u3(), "hook"));
         } catch (Exception var1) {
         }
      }
   }
}
