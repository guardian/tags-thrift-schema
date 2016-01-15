include "tag.thrift"

namespace scala com.gu.tagmanagement

struct PodcastMetadata {
    1: required list<Tag> tags;
}
