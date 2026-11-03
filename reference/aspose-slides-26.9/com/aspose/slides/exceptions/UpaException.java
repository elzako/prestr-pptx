package com.aspose.slides.exceptions;

public class UpaException extends Exception {
   private Object n5;
   private Object l6;

   public UpaException(Object particle1, Object particle2) {
      this.n5 = particle1;
      this.l6 = particle2;
   }

   public final Object getParticle1() {
      return this.n5;
   }

   public final Object getParticle2() {
      return this.l6;
   }
}
