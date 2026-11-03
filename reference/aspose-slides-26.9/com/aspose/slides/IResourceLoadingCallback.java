package com.aspose.slides;

/**
 * Controls external-resource loading, including lazy reads during rendering.
 * @see <a href="https://reference.aspose.com/slides/java/com.aspose.slides/resourceloadingaction/">Loading actions</a>
 */
public interface IResourceLoadingCallback {
   /** Returns Default, Skip, or UserProvided after optionally updating args. */
   int resourceLoading(IResourceLoadingArgs args);
}
